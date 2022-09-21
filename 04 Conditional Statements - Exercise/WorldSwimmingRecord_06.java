package FirstStepsInCodingLab;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeForOneMeterInSeconds = Double.parseDouble(scanner.nextLine());

        double timeToSwimTheDistance = distanceInMeters * timeForOneMeterInSeconds;
        double waterResistanceAddedTime = Math.floor(distanceInMeters / 15) * 12.5;

        double totalTimeToSwimTheDistance = timeToSwimTheDistance + waterResistanceAddedTime;

        double diff = Math.abs(totalTimeToSwimTheDistance - worldRecordInSeconds);

        if(totalTimeToSwimTheDistance < worldRecordInSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTimeToSwimTheDistance);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }

    }
}
