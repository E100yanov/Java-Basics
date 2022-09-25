package FirstStepsInCodingLab;

import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for(int i = 1; i <= n * 2; i++){
            int number = Integer.parseInt(scanner.nextLine());

            if(i <= n){
                leftSum += number;
            }else {
                rightSum += number;
            }
        }

        int diff = Math.abs(leftSum - rightSum);

        if(leftSum == rightSum){
            System.out.println("Yes, sum = " + leftSum);
        }else {
            System.out.println("No, diff = " + diff);
        }
    }
}
