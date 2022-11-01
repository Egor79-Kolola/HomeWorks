import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n, fact = 1;
        Scanner cons = new Scanner(System.in);
        System.out.println("Введите целое число, факториал которого будем вычислять");
        n= cons.nextInt();
        for (int i=1; i <=n; i++) {
            fact = fact * i;
        }
        System.out.println("Факториал числа " + n + " равен " + fact);
    }
}
