package FirstStepsInCodingLab;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        if(sales < 0){
            System.out.println("error");
            return;
        }

        double commission;

        switch (town){
            case "Sofia":
                if(sales <= 500){
                    commission = 0.05;
                }else if(sales <= 1000){
                    commission = 0.07;
                }else if(sales <= 10_000){
                    commission = 0.08;
                }else {
                    commission = 0.12;
                }
                break;

            case "Varna":
                if(sales <= 500){
                    commission = 0.045;
                }else if(sales <= 1000){
                    commission = 0.075;
                }else if(sales <= 10_000){
                    commission = 0.10;
                }else {
                    commission = 0.13;
                }
                break;

            case "Plovdiv":
                if(sales <= 500){
                    commission = 0.055;
                }else if(sales <= 1000){
                    commission = 0.08;
                }else if(sales <= 10_000){
                    commission = 0.12;
                }else {
                    commission = 0.145;
                }
                break;

            default:
                System.out.println("error");
                return;
        }
        System.out.printf("%.2f", sales * commission);
    }
}
