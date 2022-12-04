import java.io.*;
import java.util.*;

public class Day3_1 {
    public static void main(String[] args)
            throws FileNotFoundException {

        // Read in file, split it by new line to get each rucksack
        File file = new File("src/Day3_1 input");
        Scanner scan = new Scanner(file);
        scan.useDelimiter("\n");

        // Initialize list of common letters
        List<Character> commons = new ArrayList<>();

        for (int i = 0; i < 300; i++) {

            // Scan in the rucksack, split it in twain
            String rucksack = scan.next();
            int mid = rucksack.length() / 2;
            String[] parts = {rucksack.substring(0, mid), rucksack.substring(mid)};


            // Check for commonalities, add it to a list of commonalities if they're there
            outer:
            for (int j = 0; j < parts[0].length(); j++){
                for (int z = 0; z < parts[1].length(); z++){
                    if (parts[0].charAt(j) == parts[1].charAt(z)){
                        commons.add(parts[0].charAt(j));
                        break outer;
                    }
                }
            }
        }
        // Convert it to the scoring system
        int total = 0;
        for (Character common : commons) {
            if (Character.isUpperCase(common)) {
                total += (int) common - 38;
            } else{
                total += (int) common - 96;
            }
        }
        System.out.println(total);
    }
}