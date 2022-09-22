package FirstStepsInCodingLab;

import java.util.Scanner;

public class InvalidNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        if(number != 0 && number < 100 || number > 200){
            System.out.println("invalid");
        }
    }
}
