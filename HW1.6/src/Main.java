//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 9;
        if (n % 2 == 0 & n > 99) {
            System.out.println("Четное трехзначное число");
        } else if (n % 2 == 0 & n <= 99 & n > 9) {
            System.out.println("Четное двузначное число");
        } else if (n % 2 == 0 & n <= 9) {
            System.out.println("Четное однозначное число");
        } else if (n % 2 != 0 & n > 99) {
            System.out.println("Нечетное трехзначное число");
        } else if (n % 2 != 0 & n <= 99 & n > 9) {
            System.out.println("Нечетное двузначное число");
        } else if (n % 2 != 0 & n <= 9) {
            System.out.println("Нечетное однозначное число");
        }
    }
}