package FirstStepsInCodingLab;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++){
            int number = Integer.parseInt(scanner.nextLine());

            if(number > max){
                max = number;
            }

            sum += number;
        }

        int sumOfNumbersExcludingMax = sum - max;
        int diff = Math.abs(sumOfNumbersExcludingMax - max);

        if(sum - max == max){
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        }else {
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
