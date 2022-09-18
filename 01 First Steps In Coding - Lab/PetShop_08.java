package FirstStepsInCodingLab;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int packOfDogFood = Integer.parseInt(scanner.nextLine());
        int packOfCatFood = Integer.parseInt(scanner.nextLine());

        double totalCost = packOfDogFood * 2.50 + packOfCatFood * 4;

        System.out.printf("%.1f lv.", totalCost);
    }
}
