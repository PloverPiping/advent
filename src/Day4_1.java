import java.io.*;
import java.util.*;

public class Day4_1 {
    public static void main(String[] args)
            throws FileNotFoundException {

        // Read in file, split it by new line to get each pair
        File file = new File("src/Day4_1 input");
        Scanner scan = new Scanner(file);
        scan.useDelimiter("\n");

        // Initialize output variable
        int hits = 0;

        for (int i = 0; i < 1000; i++) {
            String[] pair = scan.next().split("[^0-9]");
            if (((Integer.parseInt(pair[0]) <= Integer.parseInt(pair[2]))
                    && (Integer.parseInt(pair[1]) >= Integer.parseInt(pair[3])))
                    || ((Integer.parseInt(pair[2]) <= Integer.parseInt(pair[0]))
                    && (Integer.parseInt(pair[3]) >= (Integer.parseInt(pair[1]))))){
                hits ++;
                System.out.println(hits);
            }
        }
        System.out.println(hits);
    }
}
