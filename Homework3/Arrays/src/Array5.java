import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        int a, b, n, ind = -1;
        int [] arr = new int[20];
        System.out.println("Введите нижний предел дтапазона для значений массива");
        a = cons.nextInt();
        do {
            System.out.println("Введите верхний предел дтапазона для значений массива");
            b = cons.nextInt();
        } while (a>=b);
        for (int i=0; i < 20; i++) {
            arr [i] = (int)((Math.random()*(b-a))+a);
        }
        System.out.println("Введите число");
        n = cons.nextInt();
        for (int i = 0; i <20; i++){
            if (arr[i]==n){
                ind = i;
                break;
            }
        }
        if (ind!=-1)  System.out.println("Число " + n + " является членом массива с индексом " + ind);
        else System.out.println("Число " + n + " отсутствует в массиве");

    }
}
