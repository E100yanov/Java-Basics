package FirstStepsInCodingLab;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extrasCount = Integer.parseInt(scanner.nextLine());
        double clothesPriceForASingleExtra = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;

        if(extrasCount > 150){
            clothesPriceForASingleExtra *= 0.90;
        }

        double totalMoneyNeeded = extrasCount * clothesPriceForASingleExtra + decor;

        double diff = Math.abs(budget - totalMoneyNeeded);

        if(budget >= totalMoneyNeeded){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }

    }
}
