import java.util.Scanner;

public class Guiter implements Insrument{
   Scanner sc = new Scanner(System.in);

    private int strings;

    public void Guiter () {    }

    @Override
    public void play() {
        System.out.printf("Играет гитара %d - и струнная \n", strings);
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }
}
