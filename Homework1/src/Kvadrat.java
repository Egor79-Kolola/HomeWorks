import java.util.Scanner;

public class Kvadrat {
    public static void main(String[] args) {
        int a, b, c, count1 = 0, count2 = 0;
        Scanner cons = new Scanner(System.in);
        System.out.println("Введите два положительных числа - параметры прямоугольника");
        a = cons.nextInt();
        b = cons.nextInt();

        System.out.println("Введите длинну стороны квадрата");
        c = cons.nextInt();

        do {
            a = a - c;
            count1++;
        } while (a >= c);
        do {
            b = b - c;
            count2++;
        } while (b >= c);

        System.out.println("На прямоугольнике со сторонами" + (a+count1*c) + "*" + (b+count2*c) + " расположено " + count1*count2 + " квадратов со стороной " + c);
    }
}
