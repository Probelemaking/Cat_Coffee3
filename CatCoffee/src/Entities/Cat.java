package Entities;

abstract public class Cat {
    protected String name;
    protected int age;
    protected Boolean gender;
    protected double price;

    Cat(String name, int age, Boolean gender, double price) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.price = price;
    }

    public double GetPrice()
    {
        return price;
    }

    @Override
    public abstract String toString();
}



