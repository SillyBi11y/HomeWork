//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            String fio = IncorrectInfoException.fioIn();
            System.out.println(fio + " всё в порядке");
        } catch (IncorrectInfoException ex) {
            ex.printStackTrace();
        }

        try {
            int age = IncorrectInfoException.ageIn();
            System.out.println(age + " всё в порядке");
        } catch (IncorrectInfoException ex) {
            ex.printStackTrace();
        }
    }
}