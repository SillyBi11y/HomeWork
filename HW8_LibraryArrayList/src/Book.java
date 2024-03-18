import java.util.Scanner;

public class Book {
    public static String name = "";
    public static String authorName = "";
    public static String text = "";

    Book(){}

    public void bookIn(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Какую книгу вы хотите взять?");
        System.out.println("Введите название книги:");
        name = scan.nextLine();
        System.out.println("Введите автора:");
        authorName = scan.nextLine();
    }

}
