import java.util.Scanner;

public class Otrezki {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        int a, b, count = 0;
        System.out.println("Введите два положительных числа");
        a = cons.nextInt();
        b = cons.nextInt();

        if (a < b){
            int temp = a;
            a = b;
            b = temp;
        }
        do {
            a = a - b;
            count++;
        } while (a >= b);
        System.out.println("На отрезке длинны " + (a+count*b) + " расположено " + count + " отрезков длины " + b);
    }

}
