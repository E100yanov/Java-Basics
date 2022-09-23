package FirstStepsInCodingLab;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int overnightsCount = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month){
            case "May":
            case "October":
                studioPrice = 50;
                apartmentPrice = 65;

                if(overnightsCount > 7 && overnightsCount <= 14){
                    studioPrice *= 0.95;
                }else if(overnightsCount > 14){
                    studioPrice *= 0.70;
                }
                break;

            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;

                if(overnightsCount > 14){
                    studioPrice *= 0.80;
                }
                break;

            case "July":
            case "August":
                studioPrice = 76;
                apartmentPrice = 77;
                break;
        }

        if(overnightsCount > 14){
            apartmentPrice *= 0.90;
        }

        System.out.printf("Apartment: %.2f lv.%n", overnightsCount * apartmentPrice);
        System.out.printf("Studio: %.2f lv.", overnightsCount * studioPrice);

    }
}
