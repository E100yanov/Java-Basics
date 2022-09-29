package FirstStepsInCodingLab;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfUnsatisfactoryGrades = Integer.parseInt(scanner.nextLine());
        int unsatisfactoryGradesCounter = 0;
        int problemCounter = 0;
        int gradeSum = 0;
        boolean tooManyBadGrades = false;   // flag
        String lastProblem = "";
        String input = scanner.nextLine();

        while (!input.equals("Enough")){
            String problemName = input;
            int grade = Integer.parseInt(scanner.nextLine());

            if(grade <= 4){
                unsatisfactoryGradesCounter++;
            }

            if(unsatisfactoryGradesCounter == numberOfUnsatisfactoryGrades){
                tooManyBadGrades = true;
                break;
            }
            problemCounter++;
            gradeSum += grade;
            lastProblem = problemName;
            input = scanner.nextLine();
        }

        if(tooManyBadGrades){
            System.out.printf("You need a break, %d poor grades.", numberOfUnsatisfactoryGrades);
        }else {
            double averageScore = 1.0 * gradeSum / problemCounter;
            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.println("Number of problems: " + problemCounter);
            System.out.println("Last problem: " + lastProblem);
        }
    }
}
