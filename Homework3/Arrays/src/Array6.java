import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        int a, b, n;
        do {
            System.out.println("Введите размер массива");
            n = cons.nextInt();
        }while (n < 0);
        int [] arr = new int[n];
        System.out.println("Введите нижний предел дтапазона для значений массива");
        a = cons.nextInt();
        do {
            System.out.println("Введите верхний предел дтапазона для значений массива");
            b = cons.nextInt();
        } while (a>=b);
        for (int i=0; i < n; i++) {
            arr [i] = (int)((Math.random()*(b+1-a))+a);
        }
        for (int i=0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        for (int i =0; i < n/2; i++) {
            int temp = arr[i];
            arr [i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.println("");
        for (int i=0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
