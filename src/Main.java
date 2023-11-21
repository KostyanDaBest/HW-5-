import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int[][] array = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для прибавления к каждому элементу массива:");
        int numberToAdd = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] += numberToAdd;
            }
        }
        System.out.println("Массив после добавления чисел:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
