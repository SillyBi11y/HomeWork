//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int m = 4;
int d = 13;
switch (d){
    case 6: System.out.println("шестерка"); break;
    case 7: System.out.println("семерка");break;
    case 8:System.out.println("восьмерка");break;
    case 9:System.out.println("девятка");break;
    case 10:System.out.println("десятка");break;
    case 11:System.out.println("валет");break;
    case 12:System.out.println("дама");break;
    case 13:System.out.println("король");break;
    case 14:System.out.println("туз");break;
}
switch(m){
    //пики
    case 1:
       System.out.println("пик");
        break;
    //трефы
    case 2:
        System.out.println("треф");
        break;
        //бубны
    case 3:
        System.out.println("бубен");
        break;
        //червы
    case 4:
        System.out.println("червей");
        break;
}
    }
}