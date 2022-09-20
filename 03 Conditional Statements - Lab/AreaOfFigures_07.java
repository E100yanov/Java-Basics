import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfGeometryFigure = scanner.nextLine();

        double area = 0;
        double sideA, sideB, radius;

        switch (typeOfGeometryFigure){
            case "square":
                sideA = Double.parseDouble(scanner.nextLine());
                area = sideA * sideA;
                break;

            case "rectangle":
                sideA = Double.parseDouble(scanner.nextLine());
                sideB = Double.parseDouble(scanner.nextLine());
                area = sideA * sideB;
                break;

            case "circle":
                radius = Double.parseDouble(scanner.nextLine());
                area = Math.PI * radius * radius;
                break;

            case "triangle":
                sideA = Double.parseDouble(scanner.nextLine());
                sideB = Double.parseDouble(scanner.nextLine());
                area = (sideA * sideB) / 2;
                break;
        }
        System.out.printf("%.3f", area);
    }
}
