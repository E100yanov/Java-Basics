package FirstStepsInCodingLab;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.next();

        double result = 0;

        if(n2 == 0){
            System.out.printf("Cannot divide %d by zero", n1);
            return;
        }

        switch (operator){
            case"+":
                result = n1 + n2;
                if(result % 2 ==0){
                    System.out.printf("%d %s %d = %.0f - even", n1, operator, n2, result);
                }else {
                    System.out.printf("%d %s %d = %.0f - odd", n1, operator, n2, result);
                }
                break;

            case"-":
                result = n1 - n2;
                if(result % 2 ==0){
                    System.out.printf("%d %s %d = %.0f - even", n1, operator, n2, result);
                }else {
                    System.out.printf("%d %s %d = %.0f - odd", n1, operator, n2, result);
                }
                break;

            case"*":
                result = n1 * n2;
                if(result % 2 ==0){
                    System.out.printf("%d %s %d = %.0f - even", n1, operator, n2, result);
                }else {
                    System.out.printf("%d %s %d = %.0f - odd", n1, operator, n2, result);
                }
                break;

            case"/":
                result = 1.0 * n1 / n2;
                System.out.printf("%d %s %d = %.2f", n1, operator, n2, result);
                break;

            case"%":
                result = n1 % n2;
                System.out.printf("%d %s %d = %.0f", n1, operator, n2, result);
                break;
        }
    }
}
