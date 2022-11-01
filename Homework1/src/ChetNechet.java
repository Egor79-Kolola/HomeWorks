import java.util.Scanner;

public class ChetNechet {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        int n;
        System.out.println("Введите целое число");
        n = cons.nextInt();
         if (n%2 == 0)
                System.out.println("Вы ввели число: " + n + ". Число четное.");
            else System.out.println("Вы ввели число: " + n + ". Число нечетное.");


    }
}
