package FirstStepsInCodingLab;

import java.util.Scanner;

public class WorkingHours_07 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int hour = Integer.parseInt(keyboard.nextLine());
        String day = keyboard.nextLine();

        if(hour >= 10 && hour <= 18){
            switch (day){
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    System.out.println("open");
                    break;
                case "Sunday":
                    System.out.println("closed");
            }
        }else {
            System.out.println("closed");
        }
    }
}
