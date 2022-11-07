import java.util.Scanner;

public class Tube implements Insrument{
    Scanner sc = new Scanner(System.in);
    private int diameter;

    public void Tube () {   };

    @Override
    public void play() {
        System.out.printf("Играет труба %d сантиметров \n", diameter);
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
