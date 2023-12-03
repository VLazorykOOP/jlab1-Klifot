import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть розмірність матриці n (n <= 20):");
        int n = scanner.nextInt();

        if (n <= 0 || n > 20) {
            System.out.println("Некоректна розмірність матриці. Введіть n в межах [1, 20].");
            scanner.close();
            return;
        }

        int[][] matrix = new int[n][n];

        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int maxSumOfAbsoluteValues = Integer.MIN_VALUE;
        int minColumnValue = Integer.MAX_VALUE;
        int resultColumn = 0;

        for (int j = 0; j < n; j++) {
            int sumOfAbsoluteValues = 0;

            for (int i = 0; i < n; i++) {
                sumOfAbsoluteValues += Math.abs(matrix[i][j]);
            }

            if (sumOfAbsoluteValues > maxSumOfAbsoluteValues || (sumOfAbsoluteValues == maxSumOfAbsoluteValues && matrix[0][j] < minColumnValue)) {
                maxSumOfAbsoluteValues = sumOfAbsoluteValues;
                minColumnValue = matrix[0][j];
                resultColumn = j;
            }
        }

        scanner.close();

        System.out.println("Найменше значення серед елементів стовпчика з найбільшою сумою модулів: " + minColumnValue);
    }
}
