package Entities;

public class Customer {
    protected String name;
    protected int rua_number;
    protected LocationDate locationDate;

    Customer() {
    }
    public Customer(String name, int rua_number, LocationDate locationDate) {
        this.locationDate = locationDate;
        this.name = name;
        this.rua_number = rua_number;
    }
    public int outRua_number(){
        return rua_number;
    }

}
