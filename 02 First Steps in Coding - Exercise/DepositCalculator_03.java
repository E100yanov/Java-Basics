package FirstStepsInCodingLab;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int depositPeriod = Integer.parseInt(scanner.nextLine());
        double yearInterest = Double.parseDouble(scanner.nextLine()) / 100;    // devide by 100 to convert it for percent use

        double finalSum = depositSum  + depositPeriod * ((depositSum * yearInterest) / 12);
        System.out.println(finalSum);
    }
}
