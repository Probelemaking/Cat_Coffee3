package Entities;


public class BlackCat extends Cat {
    public BlackCat(String name, int age, Boolean gender) {
        super(name, age, gender, 350);
    }

    @Override
    public String toString() {
        return "OrangeCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", price=" + price +
                '}';
    }
}
