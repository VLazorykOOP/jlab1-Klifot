import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();

        double result = a / (Math.pow(b, 2) - 2) + b / (Math.pow(a, 2) + 2) + Math.pow(a * b, 3);
        System.out.println("Результат (дійсний тип): " + result);

        scanner.close();
    }
}
 