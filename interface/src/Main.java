import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Размер массива: ");
        int size = input.nextInt();
        double array[] = new double[size];
        System.out.println("Введите элементы:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
        }
        Container container = new Choice(array);
        container.sort();
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        container.foreach();
        System.out.println("Измененный массив:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

    }
}
