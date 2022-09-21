package FirstStepsInCodingLab;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int episodeLength = Integer.parseInt(scanner.nextLine());
        int lunchBreakLength = Integer.parseInt(scanner.nextLine());

        double lunchDuration = 1.0 * lunchBreakLength / 8;
        double relaxDuration = 1.0 * lunchBreakLength / 4;

        double timeLeftToWatchAnEpisode = lunchBreakLength - (lunchDuration + relaxDuration);

        double diff = Math.abs(timeLeftToWatchAnEpisode - episodeLength);

        if(timeLeftToWatchAnEpisode >= episodeLength){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(diff));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(diff));
        }
    }
}
