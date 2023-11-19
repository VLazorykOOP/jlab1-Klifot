import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите значение y: ");
        double y = scanner.nextDouble();

        double numerator = x * y + Math.pow(x + y, 3);
        double denominator = Math.pow(x, 2) * Math.pow(y, 2) * (x - y);

        int result;
        if (denominator == 0) {
            System.out.println("Знаменатель равен нулю, деление на ноль невозможно.");
        } else {
            double resultDouble = numerator / denominator;
            result = (int) resultDouble; // Преобразование результата в целое число.
            System.out.println("Результат: " + result);
        }

        scanner.close(); // Закрываем Scanner после использования.
    }
}
