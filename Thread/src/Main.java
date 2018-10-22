import java.util.Random;
import java.util.Scanner;

public class Main {
    public int size;
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Размер матрицы: ");
        int size = input.nextInt();
        int matrix[][] = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(500);
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        MyThread[] thread = new MyThread[size];
        for (int i=0;i<thread.length;i++){
            thread[i] = new MyThread(matrix[i]);
            thread[i].start();
        }
        int m = Integer.MIN_VALUE;
        try {
            for(int i=0;i<thread.length;i++){
                thread[i].join();
                m = Math.max(m,thread[i].getMax());
            }
        }
        catch (InterruptedException e){
            System.out.println("Поток прерывался");
        }
        System.out.println("Максимум= "+m);
    }
}
