package FirstStepsInCodingLab;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        String input = scanner.nextLine();

        int checkedBooksCounter = 0;

        while (!input.equals("No More Books")){
            String book = input;


            if(book.equals(searchedBook)){
                System.out.printf("You checked %d books and found it.", checkedBooksCounter);
                return;
            }
            checkedBooksCounter++;
            input = scanner.nextLine();
        }

        if(input.equals("No More Books")){
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", checkedBooksCounter);
        }
    }
}
