package FirstStepsInCodingLab;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int evaluatorCount = Integer.parseInt(scanner.nextLine());

        double totalActorPoints = academyPoints;

        for(int i = 1; i <= evaluatorCount; i++){
            String evaluatorName = scanner.nextLine();
            double evaluatorPoints = Double.parseDouble(scanner.nextLine());

            totalActorPoints += ((evaluatorName.length() * evaluatorPoints) / 2);

            if(totalActorPoints >= 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalActorPoints);
                return;
            }
        }

        if(totalActorPoints < 1250.5){
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalActorPoints);
        }

    }
}
