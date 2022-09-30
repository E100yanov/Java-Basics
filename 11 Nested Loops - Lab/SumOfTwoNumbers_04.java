package FirstStepsInCodingLab;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginning = Integer.parseInt(scanner.nextLine());
        int ending = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int combinationCounter = 0;

        for(int num1 = beginning; num1 <= ending; num1++){
            for(int num2 = beginning; num2 <= ending; num2++){
                combinationCounter++;

                if(num1 + num2 == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationCounter, num1, num2, magicNumber);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", combinationCounter, magicNumber);
    }
}
