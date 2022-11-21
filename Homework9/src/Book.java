import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable {
    transient Scanner cons = new Scanner(System.in);
    String name;
    String autorName;
    String text;

    Book () {
        System.out.println("Введите название книги");
        name = cons.nextLine();

        System.out.println("Введите автора");
        autorName = cons.nextLine();
    }
}