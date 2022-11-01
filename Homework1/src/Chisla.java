import java.util.Scanner;

public class Chisla {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        int a, b, count = 0;
        System.out.println("Введите два числа");
        a = cons.nextInt();
        b = cons.nextInt();

        if (a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = b-1; i > a; i--) {
            System.out.println(i);
            count++;
        }
        System.out.println("Между числами " + a + " и " + b + " расположено " + count + " чисел.");
    }
}
