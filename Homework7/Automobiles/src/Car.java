import java.util.Scanner;

public class Car {
    Scanner sc = new Scanner(System.in);
    private  String brand;
    private String car_class;
    private double wight;
    private Driver dr;
    private Engine eng;

    public void start (){
        System.out.println("Поехали");
    }
    public void stop () {
        System.out.println("Останавливаемся");
    }
    public void turnRight () {
        System.out.println ("Поворот направо");
    }
    public void turnLeft (){
        System.out.println("Поворот налево");
    }
    public void toString (Car car) {
        System.out.println(getBrand() + getCar_class() + getWight());
        System.out.println(eng.getManufacturer() + eng.getPower());
        System.out.println(dr.getSurname() + dr.getName() + dr.getSecondName() + " стаж " + dr.getDrivingExperience());
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCar_class() {
        return car_class;
    }

    public void setCar_class(String car_class) {
        this.car_class = car_class;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public Driver getDr() {
        return dr;
    }

    public void setDr(String name) {
        this.dr = new Driver();
        this.dr.setName(name);
        System.out.println("Введите фамилию водителя");
        this.dr.setSurname(sc.nextLine());
        System.out.println("Введите отчество водителя");
        this.dr.setSecondName(sc.nextLine());
        System.out.println("Введите водительский стаж водителя (количество полных месяцев)");
        this.dr.setDrivingExperience(sc.nextInt());
    }

    public Engine getEng() {
        return eng;
    }

    public void setEng(String manufacturer) {
        this.eng = new Engine();
        this.eng.setManufacturer(manufacturer);
        System.out.println("Введите мощность двигатедя");
        this.eng.setPower(sc.nextInt());
    }
}
