import java.io.*;
import java.util.*;

public class Day3_2 {
    public static void main(String[] args)
            throws FileNotFoundException {

        // Read in file, split it by new line to get each rucksack
        File file = new File("src/Day3_1 input");
        Scanner scan = new Scanner(file);
        scan.useDelimiter("\n");

        // Initialize list of common letters
        List<Character> commons = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            // Scan in the rucksack, split it in twain

            List<String> parts = new ArrayList<>();
            for (int q = 0; q < 3; q++){
                String oi = scan.next();
                parts.add(oi);
                System.out.println(oi);

            }


            // Check for commonalities, add it to a list of commonalities if they're there
            outer:
            for (int j = 0; j < parts.get(0).length(); j++) {
                for (int z = 0; z < parts.get(1).length(); z++) {
                    for (int l = 0; l < parts.get(2).length(); l++){
                        if ((parts.get(0).charAt(j) == parts.get(1).charAt(z))
                                && (parts.get(0).charAt(j) == parts.get(2).charAt(l))) {
                            commons.add(parts.get(0).charAt(j));
                            break outer;
                        }
                    }
                }
            }
        }
        // Convert it to the scoring system
        int total = 0;
        for (Character common : commons) {
            if (Character.isUpperCase(common)) {
                total += (int) common - 38;
            } else {
                total += (int) common - 96;
            }
        }
        System.out.println(total);
    }
}
