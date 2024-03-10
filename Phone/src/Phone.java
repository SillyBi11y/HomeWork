import java.util.Scanner;

public class Phone {
    int number;
    String model;
    int weight;
    String name = "Саня";

    public Phone(String model, int number, int weight){
        this.model = model;
        this.number = number;
        this.weight = weight;
        Phone p = new Phone("Iphone",235235);
    }

    public Phone(String model, int number){
        this.model = model;
        this.number = number;
    }
    public Phone(){}


    public void receiveCall(int number, String name){
        System.out.println(number + " Звонит " + name);
    }

    public void receiveCall(){
        System.out.println("Звонит " + name);
    }
    public void getNumber(){
        System.out.println(number);
    }

    public void objectOut(){
        System.out.println("Номер: " + number + ", Модель: " + model + ", Вес " + weight);
    }

    public void objectIn(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите модель: ");
        model = scanner.nextLine();
        System.out.println("Введите номер: ");
        number = scanner.nextInt();
        System.out.println("Введите вес: ");
        weight = scanner.nextInt();
    }
    public static void sendMessage(String...words){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номера, которым вы хотите отправить сообщения: ");
        System.out.println("Первый телефон: ");
        String n1 = scanner.nextLine();
        System.out.println("Второй телефон: ");
        String n2 = scanner.nextLine();
        System.out.println("Третий телефон: ");
        String n3 = scanner.nextLine();
        print("Сообщение отправлено на номера: " + n1 + " " + n2 + " " + n3);
    }
    public static void print(String... words){
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
