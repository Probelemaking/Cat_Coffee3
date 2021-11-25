package Services;

import Entities.Cat;
import Entities.Customer;

import java.util.ArrayList;
import java.util.List;

import Exceptions.CatNotFoundException;
import Exceptions.InsufficientBalanceException;

public class MyCateCafe implements CatCafe {
    protected double restMoney;
    protected List<Cat> Cats = new ArrayList<Cat>();


    protected List<Customer> Customers = new ArrayList<Customer>();

    public MyCateCafe(double restMoney) {
        this.restMoney = restMoney;
    }

    public void getMoney(double money) {
        restMoney += money;
    }

    public void buyCat(Cat cat) {
        if (restMoney >= cat.GetPrice()) {
            restMoney -= cat.GetPrice();
            Cats.add(cat);
            System.out.println("购买成功");
        }
            else{
            throw new InsufficientBalanceException("余额不足");
        }


        }
        public void treatCustomer (Customer customer){

            if (Cats.size() != 0) {
                Customers.add(customer);
                restMoney += 15 * customer.outRua_number();
                int number = (int) (Math.random() * Cats.size());
                System.out.println("您当前rua的猫为：");
                System.out.println(Cats.get(number));
            } else {
                throw new CatNotFoundException("当前没有可以rua的猫");
            }
        }


        public void closeDown () {
            System.out.println("今日光顾的顾客有：");
            for (Customer it : Customers) System.out.println(it.toString());
            System.out.print("今日的利润为：");
            System.out.println(restMoney);
        }

    }
