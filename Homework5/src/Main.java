import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number;
       String model;
       double weight;
       Phone[] arrPhone = new Phone[3];
      for (int i=0; i < 3; i++){
          System.out.println("Введите номер телефона:");
          number = sc.nextInt();

          System.out.println("Введите модель телефона:");
          model = sc.next();

          System.out.println("Введите вес телефона:");
          weight = sc.nextDouble();
          arrPhone [i] = new Phone(number, model, weight);
      }
      for (Phone p: arrPhone) {
            System.out.println( p.getModel() + " " + p.getNumber() + " " + p.getWeight());
      }

      arrPhone[2].receiveCall("Егор", 375445697);

      arrPhone[0].sendMessage(arrPhone);

    }
}