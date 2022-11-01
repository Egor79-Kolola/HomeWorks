import java.util.Scanner;

public class Phone {
    private  int number;
    private  String model;
    private  double weight;

    public void Phone () {}

    public Phone(int number, String model) {
        setNumber(number);
        setModel(model);
    }
    public Phone(int number, String model, double weight) {
        this(number, model);
        setWeight(weight);
    }

     void receiveCall (String name){
         System.out.print( "Звонит " + name );

     }

    void receiveCall (String name, int number){
        receiveCall (name);
        System.out.println(number);
    }

    void sendMessage (Phone... args){
        System.out.println("Ваше сообщение будет отправлено:");
        for (Phone v: args) {
            if (v.number == this.number){
                continue;
            }
            System.out.println(v.number);
        }
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
