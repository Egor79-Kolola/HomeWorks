import java.util.Scanner;

public class Vklad {
    public static void main(String[] args) {
        int k = 0;
        float p, x = 1000f;
        Scanner cons = new Scanner(System.in);
        System.out.println("Введите вещественное число от 0 до 25");
        p = cons.nextFloat();
        do {
            x = x + (x * p/100);
            k++;
        } while (x<1100);
        System.out.println("Вклад до 1100 рублей увеличиться за " + k + " месяцев. И составит " + x + " рублей");
    }
}
