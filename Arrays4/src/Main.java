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
        System.out.println("Массив:");
        for (int j: array){
            System.out.println(j);
        }
for(int i = 0; i < array.length;i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        System.out.println("Сортировка:");
for(int j:array){
    System.out.println(j);
}
    }
}