package FirstStepsInCodingLab;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1Count = 0, p2Count = 0, p3Count = 0, p4Count = 0, p5Count = 0;

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(scanner.nextLine());

            if(num < 200){
                p1Count++;
            }else if(num < 400){
                p2Count++;
            }else if(num < 600){
                p3Count++;
            }else if(num < 800){
                p4Count++;
            }else {
                p5Count++;
            }
        }
        double p1Percent = 1.0 * p1Count / n * 100;
        double p2Percent = 1.0 * p2Count / n * 100;
        double p3Percent = 1.0 * p3Count / n * 100;
        double p4Percent = 1.0 * p4Count / n * 100;
        double p5Percent = 1.0 * p5Count / n * 100;

        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%%n", p3Percent);
        System.out.printf("%.2f%%%n", p4Percent);
        System.out.printf("%.2f%%", p5Percent);

    }
}
