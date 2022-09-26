package FirstStepsInCodingLab;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsCount = Integer.parseInt(scanner.nextLine());

        int musala = 0, monblanc = 0, kilimanjaro = 0, k2 = 0, everest = 0;
        int totalPeopleClimbing = 0;

        for(int i = 1; i <= groupsCount; i++){
            int peopleInTheGroup = Integer.parseInt(scanner.nextLine());
            totalPeopleClimbing += peopleInTheGroup;

            if(peopleInTheGroup <= 5){
                musala += peopleInTheGroup;
            }else if(peopleInTheGroup <= 12){
                monblanc += peopleInTheGroup;
            }else if(peopleInTheGroup <= 25){
                kilimanjaro += peopleInTheGroup;
            }else if(peopleInTheGroup <= 40){
                k2 += peopleInTheGroup;
            }else {
                everest += peopleInTheGroup;
            }
        }
        System.out.printf("%.2f%%%n", 1.0 * musala / totalPeopleClimbing * 100);
        System.out.printf("%.2f%%%n", 1.0 * monblanc / totalPeopleClimbing * 100);
        System.out.printf("%.2f%%%n", 1.0 * kilimanjaro / totalPeopleClimbing * 100);
        System.out.printf("%.2f%%%n", 1.0 * k2 / totalPeopleClimbing * 100);
        System.out.printf("%.2f%%", 1.0 * everest / totalPeopleClimbing * 100);

    }
}
