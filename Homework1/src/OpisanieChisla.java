import java.util.Scanner;

public class OpisanieChisla {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        int n;
        String a, b;
        System.out.println("Введите целое число от 0  до 999");
        n = cons.nextInt();
       if (n%2 == 0)
            a = "четное";
        else a = "нечетное";

        if (n/100 > 0) b = "трёхзначное";
        else if (n/10 > 0) {b = "двухзначное";}
        else b = "однозначное";

        System.out.println(n + " " + a + " " + b + " число" );
    }
}
