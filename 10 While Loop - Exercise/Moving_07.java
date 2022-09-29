package FirstStepsInCodingLab;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int boxesThatCanFitIn = width * length * height;

        String input = scanner.nextLine();

        while (!input.equals("Done") && boxesThatCanFitIn > 0){
            int boxes = Integer.parseInt(input);

            boxesThatCanFitIn -= boxes;

            if(boxesThatCanFitIn < 0){
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(boxesThatCanFitIn));
                break;
            }
            input = scanner.nextLine();
        }

        if(input.equals("Done")){
            System.out.printf("%d Cubic meters left.", boxesThatCanFitIn);
        }
    }
}
