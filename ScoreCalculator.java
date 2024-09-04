import java.util.Scanner;

public class ScoreCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of people: ");
            int numberOfPeople = scanner.nextInt();

            int[] scores = new int[numberOfPeople];

            // Input scores for each person
            for (int i = 0; i < numberOfPeople; i++) {
                System.out.print("Enter the score for person " + (i + 1) + ": ");
                scores[i] = scanner.nextInt();
            }

            // Calculate total percentage and average
            int totalScore = 0;
            for (int score : scores) {
                totalScore += score;
            }
            double averagePercentage = (double) totalScore / numberOfPeople;

            // Calculate and display percentage for each person
            System.out.println("\nPercentage for each person:");
            for (int i = 0; i < numberOfPeople; i++) {
                double percentage = (double) scores[i] / totalScore * 100;
                System.out.println("Person " + (i + 1) + ": " + percentage + "%");
            }

            // Display average percentage
            System.out.println("\nAverage Percentage: " + averagePercentage + "%");
        }
    }
}
