import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        String str, ch;
        char [] arr1, arr2;
        int count = 0;

        System.out.println("Введите строку");
        str = cons.nextLine();

        System.out.println("Введите символ");
        ch = cons.next();
        arr1 = str.toCharArray();
        arr2 = ch.toCharArray();
        for (int i =0; i < arr1.length; i++){
            if (arr1[i] == arr2[0]) {
                count++;
            }
        }
        System.out.println(count);

    }
}
