package FirstStepsInCodingLab;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10_000;
        boolean isGoingHome = false;
        int totalSteps = 0;

        while (totalSteps < goal && !isGoingHome){
            String input = scanner.nextLine();

            if(input.equals("Going home")){
                input = scanner.nextLine();
                isGoingHome = true;
            }
            int currentSteps = Integer.parseInt(input);
            totalSteps += currentSteps;
        }
        int diff = Math.abs(totalSteps - 10_000);
        if(totalSteps >= goal){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        }else {
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}
