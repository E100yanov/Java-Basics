package FirstStepsInCodingLab;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ticketType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;

        switch (ticketType){
            case "Premiere":
                ticketPrice = 12;
                break;
            case "Normal":
                ticketPrice = 7.50;
                break;
            case "Discount":
                ticketPrice = 5;
                break;
        }

        System.out.printf("%.2f leva", rows * columns * ticketPrice);
    }
}
