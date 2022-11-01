public class Person {
    private String name;
    private String surname;
    private int age;
    private String profession;
    Person (){ };

    Person (String name, String surname, String profession, int age) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
        this.age = age;
    }

    void info(){
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Возраст: " + age);
        System.out.println("Профессия: " + profession);
    }
    void printAgeGroup () {
        printAgeGroup (age);
    }
    static void printAgeGroup (int age) {
        String group;
        if (age < 0 ) {System.out.println( "Некорректный возраст" );
            return;}
        else if (age <= 12) {group = "Детство";}
        else if (age <= 17) {group ="Юность";}
        else if (age <= 44) {group = "Молодость";}
        else if (age <= 59) {group = "Зрелость";}
        else if (age <= 74) {group = "Пожилой возраст";}
        else if (age <= 90) {group = "Старость";}
        else{group = "Долгожительство";}
        System.out.println(group);

    }
    String getFullName () {
        return surname + " " + name;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {this.age = age;}
        else System.out.println( "Возраст не может быть меньше нуля" );
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
