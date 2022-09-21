package FirstStepsInCodingLab;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int talkingDollsCount = Integer.parseInt(scanner.nextLine());
        int stuffedBearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = puzzleCount * 2.60;
        double talkingDollsPrize = talkingDollsCount * 3;
        double stuffedBearPrize = stuffedBearsCount * 4.10;
        double minionPrize = minionsCount * 8.20;
        double truckPrize = trucksCount * 2;

        double totalPrize = puzzlePrice + talkingDollsPrize + stuffedBearPrize + minionPrize + truckPrize;

        if(puzzleCount + talkingDollsCount + stuffedBearsCount + minionsCount + trucksCount >= 50){
            totalPrize *= 0.75;
        }

        double moneyEarnedAfterRent = totalPrize * 0.90;

        double diff = Math.abs(moneyEarnedAfterRent - excursionPrice);

        if(moneyEarnedAfterRent - excursionPrice >= 0){
            System.out.printf("Yes! %.2f lv left.", diff);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }

    }
}
