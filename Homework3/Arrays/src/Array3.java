import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        int a, b, n, iMax = 0;
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
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[iMax])
                iMax = i;
        }
       for (int i: arr) {
           System.out.print(i + ", ");
       }
       System.out.println("");
       System.out.println("Максимальное значение в массиве принадлежит члену массива с индексом " + iMax);
    }
}
