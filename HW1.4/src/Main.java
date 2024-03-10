//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int g = 2024;
if (g%4 != 0){
    System.out.println("год " + g + " Обычный — 365 дней");
} else if(g%100 == 0 & g%400 != 0){
    System.out.println("год " + g + " Обычный — 365 дней");
}  else {
    System.out.println("год " + g + " Високосный — 366 дней");
}
    }
}