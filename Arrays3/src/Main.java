import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите N размер массива: ");
        int N = scan.nextInt();
        System.out.println("Введите A нижний диапазон значений: ");
        int A = scan.nextInt();
        System.out.println("Введите B верхний диапазон значений: ");
        int B = scan.nextInt();
        int[] array = new int[N];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(B + 1 - A) + A;
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
               max = i;
            }
        }
        System.out.println("Массив: ");
        for(int j: array){
            System.out.println(j);
        }
        System.out.println("Индекс макс: " + max);
    }
}