package Services;

import Entities.Cat;
import Entities.Customer;

public interface CatCafe {
    void buyCat(Cat cat);

    void treatCustomer(Customer customer);

    void closeDown();

}
