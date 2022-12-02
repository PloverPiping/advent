import java.io.*;
import java.util.*;

public class Day2_1 {
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
            int bonus = 0;
            int shape = 0;
            int score = 0;

            // Nested switchers for evaluation.
            switch (round[1]) {
                case "X" -> {
                    shape = 1;
                    System.out.println(Arrays.toString(round) + shape);
                    bonus = switch (round[0]) {
                        case "A" -> 3;
                        case "B" -> 0;
                        case "C" -> 6;
                        default -> bonus;
                    };
                }
                case "Y" -> {
                    shape = 2;
                    System.out.println(Arrays.toString(round) + shape);
                    bonus = switch (round[0]) {
                        case "A" -> 6;
                        case "B" -> 3;
                        case "C" -> 0;
                        default -> bonus;
                    };
                }
                case "Z" -> {
                    shape = 3;
                    System.out.println(Arrays.toString(round) + shape);
                    bonus = switch (round[0]) {
                        case "A" -> 0;
                        case "B" -> 6;
                        case "C" -> 3;
                        default -> bonus;
                    };
                }
            }

            // Add to the score
            score += (shape + bonus);
            total_score += score;
            System.out.println(score + " " + total_score);
        }
    }
}