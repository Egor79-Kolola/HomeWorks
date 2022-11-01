import java.util.Scanner;

public class ZnakZodiaka {
    public static void main(String[] args) {
    int m, d;
    Scanner cons = new Scanner(System.in);
    System.out.println("Введите порядковый номер месяца");
    m = cons.nextInt();
    System.out.println("Введите число");
    d = cons.nextInt();
    switch (m){
        case 1:
            if (d >= 1 && d <= 19)
                System.out.println("Козерог");
            else if ((d >= 20) && (d < 32)) {
                System.out.println("Водолей");
            }else System.out.println("Такого дня нет");
            return;
        case 2: if (d > 0 && d <  19) System.out.println("Водолей");
            else if (d >= 19 && d < 30) {
            System.out.println("Рыбы");
             }else System.out.println("Такого дня нет");
            return;
        case 3: if (d > 0 && d <  21) System.out.println("Рыбы");
            else if (d >= 21 && d < 32) {
            System.out.println("Овен");
            }else System.out.println("Такого дня нет");
            return;
        case 4: if (d > 0 && d <  20) System.out.println("Овен");
            else if (d >= 20 && d < 31) {
            System.out.println("Телец");
            }else System.out.println("Такого дня нет");
            return;
        case 5: if (d > 0 && d <  21) System.out.println("Телец");
            else if (d >= 21 && d < 32) {
            System.out.println("Близнецы");
            }else System.out.println("Такого дня нет");
            return;
        case 6: if (d > 0 && d <  22) System.out.println("Близнецы");
            else if (d >= 22 && d < 31) {
            System.out.println("Рак");
            }else System.out.println("Такого дня нет");
            return;
        case 7: if (d > 0 && d <  23) System.out.println("Рак");
            else if (d >= 23 && d < 32) {
            System.out.println("Лев");
            }else System.out.println("Такого дня нет");
            return;
        case 8: if (d > 0 && d <= 22) System.out.println("Лев");
            else if (d > 22 && d < 32) {
            System.out.println("Дева");
            }else System.out.println("Такого дня нет");
            return;
        case 9: if (d > 0 && d <= 22) System.out.println("Дева");
            else if (d > 22 && d < 31) {
            System.out.println("Весы");
            }else System.out.println("Такого дня нет");
            return;
        case 10: if (d > 0 && d <= 22) System.out.println("Весы");
            else if (d > 22 && d < 32) {
            System.out.println("Скорпион");
            }else System.out.println("Такого дня нет");
            return;
        case 11: if (d > 0 && d <= 22) System.out.println("Скорпион");
            else if (d > 22 && d < 31) {
            System.out.println("Стрелец");
            }else System.out.println("Такого дня нет");
            return;
        case 12: if (d > 0 && d <  22) System.out.println("Стрелец");
            else if (d >= 22 && d < 32) {
            System.out.println("Козерог");
            }else System.out.println("Такого дня нет");
            return;
        default:
            System.out.println("Такого месяца нет");
    }
    }
}
