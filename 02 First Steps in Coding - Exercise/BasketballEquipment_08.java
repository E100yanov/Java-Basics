package FirstStepsInCodingLab;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTax = Integer.parseInt(scanner.nextLine());
        double shoes = yearTax * 0.6;
        double trainingSuit = shoes * 0.80;
        double ball = trainingSuit / 4;
        double accessory = ball / 5;

        double totalPrice = yearTax + shoes + trainingSuit + ball + accessory;
        System.out.println(totalPrice);
    }
}
