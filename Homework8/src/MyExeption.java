public class MyExeption extends Exception{
    private int age;
    private String name;

    MyExeption(int a){
        age = a;
    }
    MyExeption(String b){
        name = b;
    }
    public String toString(){
        return "MyExeption:";
    }
}
