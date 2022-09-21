package FirstStepsInCodingLab;

import java.util.Scanner;

public class TimePlus15Minutes_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = Integer.parseInt(sc.nextLine());
        int min = Integer.parseInt(sc.nextLine());

        min += 15;

        if(min > 59){
            hour += 1;
            min -= 60;
        }
        if(hour > 23){
            hour -= 24;
        }

        System.out.printf("%d:%02d", hour, min);
    }
}
