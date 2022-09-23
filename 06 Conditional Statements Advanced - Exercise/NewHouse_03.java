package FirstStepsInCodingLab;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowersType = scanner.nextLine();
        int flowersQuantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (flowersType){
            case "Roses":
                price = 5;
                break;
            case "Dahlias":
                price = 3.80;
                break;
            case "Tulips":
                price = 2.80;
                break;
            case "Narcissus":
                price = 3;
                break;
            case "Gladiolus":
                price = 2.50;
                break;
        }

        double totalPrice = price * flowersQuantity;

        if(flowersType.equals("Roses") && flowersQuantity > 80){
            totalPrice *= 0.90;
        }

        if(flowersType.equals("Dahlias") && flowersQuantity > 90){
            totalPrice *= 0.85;
        }

        if(flowersType.equals("Tulips") && flowersQuantity > 80){
            totalPrice *= 0.85;
        }

        if(flowersType.equals("Narcissus") && flowersQuantity < 120){
            totalPrice = totalPrice + (totalPrice * 0.15);
        }

        if(flowersType.equals("Gladiolus") && flowersQuantity < 80){
            totalPrice = totalPrice + (totalPrice * 0.20);
        }

        double diff = Math.abs(budget - totalPrice);

        if(budget >= totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersQuantity, flowersType, diff);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }

    }
}
