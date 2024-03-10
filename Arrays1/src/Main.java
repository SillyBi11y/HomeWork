import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(99 + 1 - 10) + 10;
        }
        String str = Arrays.toString(array);
        System.out.println(str);
        boolean b = true;
        for (int i = 1; i < array.length; i++){
            if(array[i] <= array[i-1]){
                b = false;
                break;
            }
        }
        if(b){
            System.out.println("Массив является строго возрастающей последовательностью");
        }else{
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}