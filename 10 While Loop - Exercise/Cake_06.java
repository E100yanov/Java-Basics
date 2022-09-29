package FirstStepsInCodingLab;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int piecesCount = length * width;

        String input = scanner.nextLine();

        while (!input.equals("STOP") && piecesCount > 0) {
            int piecesTaken = Integer.parseInt(input);

            piecesCount -= piecesTaken;

            if (piecesCount < 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(piecesCount));
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.", piecesCount);
        }
    }
}
