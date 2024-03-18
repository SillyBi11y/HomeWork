import java.util.Scanner;
import java.util.regex.Pattern;

public class IncorrectInfoException extends Exception {
    private int age;
    private String fio;

    public int getAge(){return age;}


    public String getFio(){return fio;}


    public IncorrectInfoException(){}

    public IncorrectInfoException(String message, int age){
        super(message);
        this.age = age;
    }

    public IncorrectInfoException(String message, String fio){
        super(message);
        this.fio = fio;
    }

    public static String fioIn() throws IncorrectInfoException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ФИО");
        String fio = scan.nextLine();
        String regex = "[а-яА-Яa-zA-Z0-9 ]+";
        boolean bul = Pattern.matches(regex, fio);
        if(fio.length()>200 | !bul){
            throw new IncorrectInfoException("Данные " + fio + " некорректны", fio);
        }

        return fio;
    }
    public static int ageIn() throws IncorrectInfoException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scan.nextInt();
        if(age>100 | age<0){
            throw new IncorrectInfoException("Возраст " + age + " некорректен", age);
        }

        return age;
    }




}
