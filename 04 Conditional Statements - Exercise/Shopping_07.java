package FirstStepsInCodingLab;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardCount = Integer.parseInt(scanner.nextLine());
        int processorCount = Integer.parseInt(scanner.nextLine());
        int ramMemoryCount = Integer.parseInt(scanner.nextLine());

        double videoCardCost = videoCardCount * 250;
        double processorCost = processorCount * (videoCardCost * 0.35);
        double ramMemoryCost = ramMemoryCount * (videoCardCost * 0.10);

        double totalCost = videoCardCost + processorCost + ramMemoryCost;

        if(videoCardCount > processorCount){
            totalCost *= 0.85;
        }

        double diff = Math.abs(totalCost - budget);

        if(budget >= totalCost){
            System.out.printf("You have %.2f leva left!", diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }

    }
}
