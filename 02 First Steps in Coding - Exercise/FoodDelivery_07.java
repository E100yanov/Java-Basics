package FirstStepsInCodingLab;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double priceOfMenus = chickenMenu * 10.35 + fishMenu * 12.40 + vegetarianMenu * 8.15;
        double desert = priceOfMenus * 0.20;

        double totalPriceOfTheOrder = priceOfMenus + desert + 2.50;

        System.out.println(totalPriceOfTheOrder);
    }
}
