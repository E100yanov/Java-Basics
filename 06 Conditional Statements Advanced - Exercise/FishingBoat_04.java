package FirstStepsInCodingLab;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermenCount = Integer.parseInt(scanner.nextLine());

        double rent = 0;

        switch (season){
            case"Spring":
                rent = 3000;
                break;
            case"Summer":
            case"Autumn":
                rent = 4200;
                break;
            case"Winter":
                rent = 2600;
                break;
        }

        if(fishermenCount <= 6 ){
            rent *= 0.90;
        }else if(fishermenCount <= 11){
            rent *= 0.85;
        }else {
            rent *= 0.75;
        }

        if(!season.equals("Autumn") && fishermenCount % 2 == 0){
            rent *= 0.95;
        }

        double diff = Math.abs(budget - rent);

        if(budget >= rent){
            System.out.printf("Yes! You have %.2f leva left.", diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
