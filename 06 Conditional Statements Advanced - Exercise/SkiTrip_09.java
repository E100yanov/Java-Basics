package FirstStepsInCodingLab;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysToStay = Integer.parseInt(scanner.nextLine());
        String accomodation = scanner.nextLine();
        String impression = scanner.nextLine();

        double price = 0;

        switch (accomodation){
            case "room for one person":
                price = 18;
                break;
            case "apartment":
                price = 25;

                if(daysToStay < 10){
                    price *= 0.70;
                }else if(daysToStay < 15){
                    price *= 0.65;
                }else {
                    price *= 0.50;
                }
                break;
            case "president apartment":
                price = 35;


                if(daysToStay < 10){
                    price *= 0.90;
                }else if(daysToStay < 15){
                    price *= 0.85;
                }else {
                    price *= 0.80;
                }
                break;
        }

        double costBeforeImpression = price * (daysToStay - 1);
        double costAfterImpression = 0;

        if(impression.equals("positive")){

            costAfterImpression = costBeforeImpression + (costBeforeImpression * 0.25);

        }else if(impression.equals("negative")){

            costAfterImpression =  costBeforeImpression * 0.90;

        }

        System.out.printf("%.2f", costAfterImpression);

    }
}
