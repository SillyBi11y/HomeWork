//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int a = 5;
int b = 4;
int c = 3;
if (a > b & c > b){
    System.out.println("a + c:");
    System.out.println(a + c);
} else if(a > c & b > c){
    System.out.println("a + b:");
    System.out.println(a + b);
} else if(b > a & c > a) {
    System.out.println("b + c:");
    System.out.println(b + c);
}
    }
}