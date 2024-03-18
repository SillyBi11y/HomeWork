import java.util.Scanner;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String link = "^(1\\d{3}|200\\d|201[0-2])/(0[1-9]|1[012])/(0[1-9]|[12]\\d|30)\\s+(?:[0-1]\\d|2[0-3]):[0-5]\\d(:[0-5]\\d)?$";
        System.out.println("Введите дату");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean matches = Pattern.matches(link, str);
        if(matches){
            System.out.println("Существует");
        }else {
            System.out.println(" Не существует");
        }
    }
}