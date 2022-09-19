package FirstStepsInCodingLab;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededNylon = Integer.parseInt(scanner.nextLine());
        int neededPaint = Integer.parseInt(scanner.nextLine());
        int diluentNeeded = Integer.parseInt(scanner.nextLine());
        int hoursForWork = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (neededNylon + 2) * 1.50;
        double paintPrice = (neededPaint + (neededPaint * 0.10)) * 14.50;
        double diluentPrice = diluentNeeded * 5.00;

        double totalPriceForMaterials = nylonPrice + paintPrice + diluentPrice + 0.40;
        double priceForWorkers = (totalPriceForMaterials * 0.30) * hoursForWork;

        double totalMoneyNeeded = totalPriceForMaterials + priceForWorkers;
        System.out.println(totalMoneyNeeded);
    }
}
