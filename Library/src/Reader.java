import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Reader {
    public static String readerName;
    public static String number;
    public static String faculty;
    public static String date;
    public static String phoneNumber;
    ArrayList<String> books = new ArrayList<String>();
    Reader(){}

    public void printStatus(){
        int numberOfBooks = books.toArray().length;
        String bookNames = Arrays.toString(new ArrayList[]{books});
        System.out.println(readerName + " взял(а) " + numberOfBooks + " книг(и): " + bookNames);
    }

    public void readerIn(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ФИО читателя:");
        readerName = scan.nextLine();
        System.out.println("Введите номер читательского билета:");
        number = scan.nextLine();
        System.out.println("Введите факультет: ");
        faculty= scan.nextLine();
        System.out.println("Введите дату рождения: ");
        date = scan.nextLine();
        System.out.println("Введите номер телефона");
        phoneNumber = scan.nextLine();
    }

    public void takeBook(){
        Book book = new Book();
        book.bookIn();
        books.add(Book.name);
        System.out.println(readerName + " взял(а) книгу " + Book.name);
    }

    public void returnBook(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите книгу которую хотите вернуть:");
        Book.name = scan.nextLine();
        int e = books.indexOf(Book.name);
        if(e == -1){
            System.out.println(readerName + " не хранит книгу " + Book.name);
        } else {
            books.remove(e);
            System.out.println(readerName + " вернул(а) книгу " + Book.name);
        }
    }
}
