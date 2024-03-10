import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Введите строку: ");
        String str  = String.valueOf(scan.nextLine());
        System.out.println("Введите символ: ");
        String ch  = String.valueOf(scan.nextLine());
        char[] s = ch.toCharArray();
        char[] array = str.toCharArray();
        int n = 0;
        for(int i = 0; i < array.length; i++){
            if (s[0] == array[i]) {
                n++;
            }
        }
        System.out.println("Количество символов в строке: " + n);
    }
}