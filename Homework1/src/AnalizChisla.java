import java.util.Scanner;

public class AnalizChisla {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        int a, b = 0, c, count = 0, sum = 0;
        boolean dva = false;
        System.out.println("Введите целое положительное число");
        a = cons.nextInt();
        c = a;
        while (c > 0){
        b = b * 10;
        b = b+c%10;
        if (c%10 == 2)
          dva = true;
        sum = sum + c%10;
        count++;
        c = c/10;

        }
        if (dva)
            System.out.println("В числе " + a + " есть цифра 2");
        else System.out.println("В числе " + a + " нет цифры 2");
        System.out.println("Число " + a + " переписанное в обратном порядке " + b);
        System.out.println("В числе " + a + "  " + count + " цифр");
        System.out.println("Сумма цифр числа " + a + " равна " + sum);


    }
}
