import java.util.Scanner;

public class PechatStrok {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");

        int i = 1, n = cons.nextInt();

        while (i <= n) {
            System.out.println("Task" + i);
            i++;
        }
    }
}
