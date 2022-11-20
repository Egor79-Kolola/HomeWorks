import java.util.Scanner;
import java.util.regex.Pattern;

public class MyExeptionDemo {
    static void Exam(String b) throws MyExeption {
        String name = "[а-яА-ЯёЁ[^a-zA-z]\s{3}[^:punct:]]{1,200}";
        if (Pattern.matches(name, b)) throw new MyExeption(b);
    }
    static void Exam(int a) throws MyExeption {
        if (a <0 || a >100) throw new MyExeption(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        try {
            System.out.println("Введите Ваши фамилию, имя и отчество через пробел");
            name = sc.nextLine();
            Exam(name);
        } catch (MyExeption e){
            System.out.println("Перехвачено исключение: " + e + "Вы ввели слишко длинную строку, используются недопустимые символы");
            e.printStackTrace();
        }
        try {
            System.out.println("Введите Ваш возраст");
            age = sc.nextInt();
            sc.nextLine();
            Exam(age);
        }catch (MyExeption e){
            System.out.println("Перехвачено исключение: " + e + "Возраст введен не корректно");
            e.printStackTrace();
        }

    }
}
