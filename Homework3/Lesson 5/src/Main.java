import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        Person per = new Person();
        int age = cons.nextInt();

        System.out.println("Введите имя:");
        per.setName(cons.next());

        System.out.println("Введите фамилию:");
        per.setSurname(cons.next());

        System.out.println("Введите возраст:");
        per.setAge(cons.nextInt());

        System.out.println("Введите профессию:");
        per.setProfession(cons.next());

        System.out.println(per.getFullName());
        per.printAgeGroup();

        System.out.println("Введите возраст:");
        Person.printAgeGroup(age);


    }

}