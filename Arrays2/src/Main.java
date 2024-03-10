import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int l = scan.nextInt();
        while (l < 0){
            System.out.println("Неверное значение. Попробуйте ещё раз:");
            l = scan.nextInt();
        }
        System.out.println("Введите нижний диапазон значений: ");
        int min = scan.nextInt();
        System.out.println("Введите верхний диапазон значений: ");
        int max = scan.nextInt();
        while (max <= min){
            System.out.println("Верхний диапазон не может быть меньше нижнего. Попробуйте ещё раз: ");
            max = scan.nextInt();
        }
        int[] array = new int[l];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(max + 1 - min) + min;
        }
        System.out.println("Массив: ");
        for (int j : array) {
            System.out.println(j);
        }
    }
}