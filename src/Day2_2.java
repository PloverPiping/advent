import java.io.*;
import java.util.*;


public class Day2_2 {
    public static void main(String[] args)
            throws FileNotFoundException {

        // Read in file, split it by new line to get each round
        File file = new File("/Users/patrickwilliams/IdeaProjects/advent/src/Day2_1 input");
        Scanner scan = new Scanner(file);
        scan.useDelimiter("\\n");

        int total_score = 0;

        // (0 if you lost, 3 if the round was a draw, and 6 if you won).
        for (int i = 0; i < 2500; i++) {
            String[] round = scan.next().trim().split("[^\\S\\t\\n\\r]");
            int score = 0;

            // Nested switchers for evaluation. rock paper scissors, lose draw win
            switch (round[0]) {
                case "A" -> score = switch (round[1]) {
                    case "X" -> 3;
                    case "Y" -> 4;
                    case "Z" -> 8;
                    default -> score;
                };
                case "B" -> score = switch (round[1]) {
                        case "X" -> 1;
                        case "Y" -> 5;
                        case "Z" -> 9;
                        default -> score;
                };
                case "C" -> score = switch (round[1]) {
                        case "X" -> 2;
                        case "Y" -> 6;
                        case "Z" -> 7;
                        default -> score;
                };
            }
        total_score += score;
        System.out.println(score + " " + total_score);
        }
    }
}
