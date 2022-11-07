import java.util.Scanner;

public class Drum implements Insrument{
    Scanner sc = new Scanner(System.in);
    private double size;

    public void Drum (){  };

    @Override
    public void play() {
        System.out.printf("Играет барабан, размером %S метра \n", size);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
