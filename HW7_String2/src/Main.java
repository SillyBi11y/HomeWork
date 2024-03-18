import java.util.Scanner;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String link = "^[a-zA-Z0-9]+\\.com+$";
        System.out.println("Введите ссылку");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(Pattern.matches(link, str));


    }
}