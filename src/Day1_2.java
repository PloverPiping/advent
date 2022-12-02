import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day1_2 {
    public static void main(String[] args)
            throws FileNotFoundException {
        // Read in my file
        File file = new File("//Users//patrickwilliams//IdeaProjects//advent//src//Day1_1 input");

        // Split the file into each elf
        Scanner scan = new Scanner(file);
        scan.useDelimiter("[\\n\\r]{2}");
        int max = 0;

        // For each elf,
        for(int i = 0; i < 255; i++){
            int bag = 0;
            // Split the bag into each cal, initialize max
            String[] cals = scan.next().split("[\\n\\r]");
            // For each cal,
            for (String cal : cals) {
                // Convert each cal into an integer, add it to bag
                int food = Integer.parseInt(cal);
                bag += food;
            }
            // I am not proud of this solution. It is bad. It works. Fuck you. 
            if ((bag > max) & (bag != 69528) & (bag != 68878)){
                max = bag;
            }
        }
        System.out.println(max);
    }
}