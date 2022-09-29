package FirstStepsInCodingLab;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());

        int dayCounter = 0;
        int spendingCounter = 0;

        while (ownedMoney < neededMoney && spendingCounter < 5){
            String command = scanner.nextLine();
            double money  = Double.parseDouble(scanner.nextLine());
            dayCounter++;

            if("save".equals(command)){
                ownedMoney += money;
                spendingCounter = 0;
            }else if("spend".equals(command)){
                ownedMoney -= money;
                spendingCounter += 1;
                if(ownedMoney < 0){
                    ownedMoney = 0;
                }
            }
        }
        if(spendingCounter == 5){
            System.out.println("You can't save the money.");
            System.out.println(dayCounter);
        }
        if(ownedMoney >= neededMoney){
            System.out.printf("You saved the money for %d days.", dayCounter);
        }
    }
}
