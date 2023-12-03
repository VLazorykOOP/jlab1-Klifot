import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення a: ");
        int a = scanner.nextInt();

        System.out.print("Введіть значення b: ");
        int b = scanner.nextInt();

        double result = (double) a / (Math.pow(b, 2) - 2) + (double) b / (Math.pow(a, 2) + 2) + Math.pow(a * b, 3);
        System.out.println("Результат (дійсний тип): " + result);
        
        scanner.close();
    }
}
