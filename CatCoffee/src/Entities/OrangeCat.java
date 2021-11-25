package Entities;

public class OrangeCat extends Cat {
    protected Boolean isFat;

    public OrangeCat(String name, int age, Boolean gender, Boolean isFat) {
        super(name, age, gender, 200);
        this.isFat = isFat;
    }

    @Override
    public String toString() {
        return "OrangeCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", price=" + price +
                ", isFat=" + isFat +
                '}';
    }
}