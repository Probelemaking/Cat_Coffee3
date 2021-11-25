import Entities.*;
import Services.MyCateCafe;

import java.util.List;

public class CoffeeTest {

    public static void main(String[] args) {
        MyCateCafe myCateCafe = new MyCateCafe(0);
        List<Cat> cats = null;
        OrangeCat cat1 = new OrangeCat("cat1", 1, true, true);
        OrangeCat cat2 = new OrangeCat("cat2", 2, false, false);
        BlackCat cat3 = new BlackCat("cat3", 3, true);
        BlackCat cat4 = new BlackCat("cat4", 4, false);
        Customer customer1 = new Customer("customer1",2,new LocationDate(2021,11,25,12,05));
       /* cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);*/
        myCateCafe.buyCat(cat1);
        //myCateCafe.treatCustomer(customer1);
    }
}
