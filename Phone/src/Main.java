//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = new Phone();
        System.out.println("Для первого телефона ");
        p1.objectIn();
        System.out.println("Для второго телефона ");
        p2.objectIn();
        System.out.println("Для третьего телефона ");
        p3.objectIn();

        System.out.println("Первый телефон: ");
        p1.objectOut();
        System.out.println("Второй телефон: ");
        p2.objectOut();
        System.out.println("Третий телефон: ");
        p3.objectOut();

        System.out.println();
        System.out.println("Звонки ");
        p1.receiveCall();
        p2.receiveCall();
        p3.receiveCall();

        System.out.println();
        System.out.println("Перегрузка звонка ");
        p1.receiveCall(375440693, "Марио" );

        System.out.println();
        System.out.println("Номера ");
        p1.getNumber();
        p2.getNumber();
        p3.getNumber();

        System.out.println();
        System.out.println("Сообщения ");
        Phone.sendMessage();
    }
}