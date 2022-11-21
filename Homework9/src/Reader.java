import java.util.LinkedList;
import java.util.Scanner;

public class Reader {
    Scanner cons = new Scanner(System.in);
    String family, name, surname, faculty, birthday, phfone;
    int numberCardReader;
    LinkedList<Book> booksList;
    Reader () {
        System.out.println("Введите фамилию читателя");
        family = cons.next();

        System.out.println("Введите имя читателя");
        name = cons.next();

        System.out.println("Введите отчество читателя");
        surname = cons.next();

        System.out.println("Введите дату рождения читателя");
        birthday = cons.nextLine();
        cons.nextLine();


        System.out.println("Введите название факультета, на котором обучается читатель");
        faculty = cons.nextLine();

        System.out.println("Введите контактный телефон читателя");
        phfone = cons.nextLine();

        System.out.println("Введите номер читательского билета");
        numberCardReader = cons.nextInt();

        booksList = new LinkedList<>();
    }

    void takeBook(){
        if (booksList.size()<10){
        booksList.add(new Book());
        System.out.println(family + name.charAt(0) + "." + surname.charAt(0) +". взял книгу: " + booksList.getLast());
        }else System.out.println("Читатель взял максмальное количество книг. Он должен вернуть хотя-бы одну");

    }

    void returnBook(String str){
        boolean bl = false;
        for (Book b: booksList) {
            if ( b.name.equals(str)){
                booksList.remove(str);
                System.out.println(family + name.charAt(0) + "." + surname.charAt(0) +". вернул книгу " + str);
                bl = true;
                break;
            }
        }
        if (!bl){
            System.out.println(family + name.charAt(0) + "." + surname.charAt(0) +". не хранит книгу " + str);
        }

    }

    void printStatus() {
        System.out.println(family + name.charAt(0) + "." + surname.charAt(0) + ". взял " + booksList.size() + " книг:");
        for (Book b: booksList) {
            System.out.println(b.name);
        }
        System.out.println();
    }

}
