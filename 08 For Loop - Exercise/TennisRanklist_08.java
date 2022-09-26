package FirstStepsInCodingLab;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int tournamentPoints = 0;
        int counterOfWins = 0;

        for(int i = 1; i <= tournamentsCount; i++){
            String result = scanner.nextLine();

            switch (result){
                case "W":
                    tournamentPoints += 2000;
                    counterOfWins++;
                    break;
                case "F":
                    tournamentPoints += 1200;
                    break;
                case "SF":
                    tournamentPoints += 720;
                    break;
            }
        }
        int finalPoints = initialPoints + tournamentPoints;
        double averagePoints = Math.floor(1.0 * tournamentPoints / tournamentsCount);
        double winsPercent = 1.0 * counterOfWins / tournamentsCount * 100;
        System.out.println("Final points: " + finalPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%", winsPercent);
    }
}
