package FirstStepsInCodingLab;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine()) / 100;  // cuz it's going ot be used as a percent

        double volume = length * width * height;
        double volumeInLitre = volume / 1000;

        double waterNeededToFIllTheAquarium = volumeInLitre * (1 - percent);
        System.out.println(waterNeededToFIllTheAquarium);
    }
}
