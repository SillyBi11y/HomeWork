import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Reader reader = new Reader();
        reader.readerIn();
        int number;
        do {
            System.out.println("Введите цифру соответствующую желаемому действию");
            System.out.println("1 - Взять книгу");
            System.out.println("2 - Вернуть книгу");
            System.out.println("3 - Статус читателя");
            System.out.println("4 - Выйти");
            number = scan.nextInt();
            switch (number) {
                case 1: {
                    reader.takeBook();
                    break;
                }
                case 2: {
                    reader.returnBook();
                    break;
                }
                case 3: {
                    reader.printStatus();
                    break;
                }
                case 4: {
                    System.out.println("Bye bye");
                    break;
                }
                default: {
                    System.out.println("Попробуйте ещё раз");
                }
            }
        } while (number != 4);


    }
}