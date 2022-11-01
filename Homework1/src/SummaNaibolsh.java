import java.util.Scanner;

public class SummaNaibolsh {

    public static void main(String[] args) {
       int a, b, c, max1, max2;

        Scanner cons = new Scanner(System.in);
        System.out.println("Введите первое число");
        a = cons.nextInt();
        System.out.println("Введите второе число");
        b = cons.nextInt();
        System.out.println("Введите третье число");
        c = cons.nextInt();
        max1 = (a > b ? a:b);
        if (max1 == a)
            max2 = (b>c ? b:c);
        else max2 = (a>c ? a:c);
        System.out.println("Сумма двух наибольших чисел равна: " + (max1+max2));
    }
}
