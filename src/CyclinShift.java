import java.util.Scanner;

public class CyclinShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення розміру масиву
        System.out.print("Введіть розмір масиву (n): ");
        int n = scanner.nextInt();

        // Ініціалізація та введення масиву A
        int[] A = new int[n];
        System.out.println("Введіть елементи масиву A:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        // Введення кількості позицій для циклічного зсуву
        System.out.print("Введіть кількість позицій для циклічного зсуву (k): ");
        int k = scanner.nextInt();

        // Виклик функції для циклічного зсуву
        cyclicallyShiftArray(A, k);

        // Виведення результату
        System.out.println("Масив після циклічного зсуву на " + k + " позицій вправо:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        // Закриття Scanner
        scanner.close();
    }

    // Функція для циклічного зсуву масиву на k позицій вправо
    private static void cyclicallyShiftArray(int[] arr, int k) {
        int n = arr.length;

        // Використовуємо тимчасовий масив для збереження елементів
        int[] temp = new int[n];

        // Заповнюємо тимчасовий масив
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        // Копіюємо елементи з тимчасового масиву назад у вихідний масив
        System.arraycopy(temp, 0, arr, 0, n);
    }
}
