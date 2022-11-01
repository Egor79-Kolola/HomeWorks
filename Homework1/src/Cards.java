import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        int n, m;
        String mast = null;

        System.out.println("Введите номар масти карты (числа от 1 до 4)");
        m = cons.nextInt();

        System.out.println("Введите достоинство карты (числа от 6 до 14");
        n = cons.nextInt();
        if (m == 1) mast = "пик";
        else if (m == 2)   mast = "треф";
        else if (m == 3)   mast = "бубен";
        else if (m == 4)   mast = "червей";
        else System.out.println("Такой масти в картах нет");

        switch (n) {

            case 6: System.out.println("Ваша карта шестёрка " + mast);
            return;
            case 7: System.out.println("Ваша карта семёрка " + mast);
            return;
            case 8: System.out.println("Ваша карта восьмёрка " + mast);
            return;
            case 9: System.out.println("Ваша карта девятка " + mast);
            return;
            case 10: System.out.println("Ваша карта десятка " + mast);
            return;
            case 11: System.out.println("Ваша карта валет " + mast);
            return;
            case 12: System.out.println("Ваша карта дама " + mast);
            return;
            case 13: System.out.println("Ваша карта король " + mast);
            return;
            case 14: System.out.println("Ваша карта туз " + mast);
            return;
            default:
                System.out.println("Такой карты в колоде нет");
        }

    }
}
