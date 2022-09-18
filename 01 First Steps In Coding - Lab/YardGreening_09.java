package FirstStepsInCodingLab;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double spaceForGreening = Double.parseDouble(scanner.nextLine());

        double priceWithoutDiscount = spaceForGreening * 7.61;
        double discount = priceWithoutDiscount * 0.18;

        double priceAfterDiscount = priceWithoutDiscount - discount;

        System.out.printf("The final price is: %.2f lv.%n", priceAfterDiscount);
        System.out.printf("The discount is: %.2f lv.", discount );

    }
}
