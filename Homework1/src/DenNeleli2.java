import java.util.Scanner;

import static java.lang.System.out;

public class DenNeleli2 {
    public static void main(String[] args) {

            Scanner cons = new Scanner(System.in);
            int n;
            out.println("Выбеоите день недели.Введите целое число от 1 до 7");
            n = cons.nextInt();
            switch (n) {
                case 1:
                    out.println("Понедельник");
                    break;
                case 2:
                    out.println("Вторник");
                    break;
                case 3:
                    out.println("Среда");
                    break;
                case 4:
                    out.println("Четверг");
                    break;
                case 5:
                    out.println("Пятница");
                    break;
                case 6:
                    out.println("Суббота");
                    break;
                case 7:
                    out.println("Воскресенье");
                    break;
                default:
                    System.out.println("Такого дня недели не существует");
            }

    }
}
