package FirstStepsInCodingLab;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toyCount = 0;
        int evenBirthdaysCount = 0;
        int moneySavedFromBirthdays = 0;
        int totalMoneySavedFromBirthdays = 0;

        for(int i = 1; i <= age; i++){

            if(i % 2 == 0){
                evenBirthdaysCount++;
                moneySavedFromBirthdays = (evenBirthdaysCount * 10) - 1;        // brother stealing
                totalMoneySavedFromBirthdays += moneySavedFromBirthdays;

            }else {
                toyCount++;
            }
        }

        int moneyFromSoldToys = toyCount * toyPrice;

        int totalMoneySaved = totalMoneySavedFromBirthdays + moneyFromSoldToys;

        double diff = Math.abs(totalMoneySaved - washingMachinePrice);

        if(totalMoneySaved >= washingMachinePrice){
            System.out.printf("Yes! %.2f", diff);
        }else {
            System.out.printf("No! %.2f", diff);
        }

    }
}
