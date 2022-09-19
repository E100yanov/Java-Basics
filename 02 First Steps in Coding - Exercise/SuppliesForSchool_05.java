package FirstStepsInCodingLab;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int packOfPens = Integer.parseInt(scanner.nextLine());
        int packOfMarkers = Integer.parseInt(scanner.nextLine());
        int cleaningProduct = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine()); // have to be divided by 100 ! can't here cuz its Integer

        double totalSumNeeded = packOfPens * 5.80  + packOfMarkers * 7.20 + cleaningProduct * 1.20;
        double discount = totalSumNeeded * (1.0 * percentDiscount / 100);
        double moneyNeededAfterDiscount = totalSumNeeded - discount;

        System.out.println(moneyNeededAfterDiscount);
    }
}
