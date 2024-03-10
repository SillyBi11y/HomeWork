import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str  = String.valueOf(scan.nextLine());
        while(str.isEmpty()){
            System.out.println("Повторите ввод:");
            str = String.valueOf(scan.nextLine());
        }
        System.out.println("Введите символ a: ");
        String a  = String.valueOf(scan.nextLine());
        System.out.println("Введите символ b: ");
        String b  = String.valueOf(scan.nextLine());
        String str2 = str.replace(a, b);
        System.out.println("Новая строка: " + str2);
    }
}