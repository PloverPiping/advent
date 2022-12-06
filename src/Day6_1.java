import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day6_1 {
    public static void main(String[] args)
            throws FileNotFoundException {

        // Read in file, get string
        File file = new File("src/Day 6_1 input");
        Scanner scan = new Scanner(file);
        scan.useDelimiter("\n");
        String input = scan.next();

        StringBuilder buffer = new StringBuilder();

        // Day 6_2 is just changing the 4s to 14s
        for (int i = 0; i < input.length(); i++){

            if (buffer.length() == 4 && buffer.chars().distinct().count() == buffer.length()){
                System.out.println(i + " " + buffer);
                break;
            }

            buffer.append(input.charAt(i));

            if (buffer.length() > 4){
                buffer = new StringBuilder(buffer.substring(1));
            }
        }



    }
}
