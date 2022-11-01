import java.util.Scanner;

public class ArifDeistvia {
    public static void main(String[] args) {

        int n;
        double a, b;
        Scanner cons = new Scanner(System.in);
        System.out.println("Введите первое число");
        a = cons.nextDouble();
        do {
            System.out.println("Введите второе число, отличное от 0");
            b = cons.nextDouble();
        } while (b == 0);

        System.out.println("Введите номер действия (1 - 4)");
        n = cons.nextInt();

        switch (n) {
            case 1:
                System.out.println(a+b);
            return;
            case 2:
                System.out.println(a-b);
            return;
            case 3:
                System.out.println (a*b);
            return;
            case 4:
                System.out.println (a/b);
            return;
            default:
                System.out.println("Такого действия нет. Попробуй снова.");
        }

    }
}
