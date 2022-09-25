package FirstStepsInCodingLab;

import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int value = 0;

        for(int i = 0; i < text.length(); i++){

            switch(text.charAt(i)){
                case 'a':
                    value += 1;
                    break;
                case 'e':
                    value += 2;
                    break;
                case 'i':
                    value += 3;
                    break;
                case 'o':
                    value += 4;
                    break;
                case 'u':
                    value += 5;
                    break;
            }
        }
        System.out.println(value);
    }
}
