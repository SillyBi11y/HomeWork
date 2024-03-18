//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        StringBuilder strBuilder1 = new StringBuilder();
        StringBuilder strBuilder2 = new StringBuilder();
        StringBuilder strBuilder3 = new StringBuilder();

        strBuilder1.append(a).append(" + ").append(b).append(" = ").append(a+b);
        strBuilder2.append(a).append(" - ").append(b).append(" = ").append(a-b);
        strBuilder3.append(a).append(" * ").append(b).append(" = ").append(a*b);
        strBuilder1.replace(7,8, "равно");
        strBuilder2.replace(7,8, "равно");
        strBuilder3.replace(7,8, "равно");

        System.out.println(strBuilder1.toString());
        System.out.println(strBuilder2.toString());
        System.out.println(strBuilder3.toString());

    }
}