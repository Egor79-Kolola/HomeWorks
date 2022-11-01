import java.util.Scanner;

public class VisokosniiGod {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        int n;
        System.out.println("Введите номер года");
        n = cons.nextInt();
        if (n%400 == 0){
            System.out.println(n + " год високосный (366 дней)");
        } else if (n%100 == 0) {
            System.out.println(n + " год не високосный (365 дней)");
        } else if (n%4 == 0) {
            System.out.println(n + " год високосный (366 дней)");
        } else  {
            System.out.println(n + " год не високосный (365 дней)");
        }
    }
}
