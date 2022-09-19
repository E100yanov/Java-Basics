package FirstStepsInCodingLab;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesNumberOfBook = Integer.parseInt(scanner.nextLine());
        int pagerPerHour = Integer.parseInt(scanner.nextLine());
        int daysToRead = Integer.parseInt(scanner.nextLine());

        int totalHoursNeededToRead = pagesNumberOfBook / pagerPerHour;
        int hoursNeededToReadPerDay = totalHoursNeededToRead / daysToRead;

        System.out.println(hoursNeededToReadPerDay);
    }
}
