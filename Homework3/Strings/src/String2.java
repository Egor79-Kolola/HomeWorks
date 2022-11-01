import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        String str1, ch1, ch2, str2;
        char [] arr1, arr2;
        
        System.out.println("Введите строку");
        str1 = cons.nextLine();

        System.out.println("Введите символ, который будем заменять");
        ch1 = cons.next();
        System.out.println("Введите символ, на который будем заменять первый символ");
        ch2 = cons.next();

        arr1 = ch1.toCharArray();
        arr2 = ch2.toCharArray();


        str2 = str1.replace(arr1[0], arr2[0]);
        System.out.print(str2);

    }
}
