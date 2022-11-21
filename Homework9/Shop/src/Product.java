public class Product {
    private String name;
    private int id;

    Product (){};
    Product (int id, String name){
        setId(id);
        setName(name);
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
