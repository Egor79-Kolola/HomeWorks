public class Main {
    public static void main(String[] args) {
        Insrument guitar = new Guiter();
        ((Guiter) guitar).setStrings(6);
        Insrument drum = new Drum();
        ((Drum)drum).setSize(1.5);
        Insrument tube = new Tube();
        ((Tube)tube).setDiameter(40);
        Insrument[] instr = new Insrument[3];

        instr[0] = guitar;

        instr[1] = drum;

        instr[2] = tube;


        for (Insrument i:instr) {
            i.play();
        }

    }
}