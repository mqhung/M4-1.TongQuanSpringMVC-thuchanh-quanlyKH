package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private static List<Customer> list = new ArrayList<>();
    static {
        list.add(new Customer(1,"Hung","mqhung@gmail.com","Ninh Binh"));
        list.add(new Customer(2,"Thinh","txthinh@gmail.com","Thai Binh"));
        list.add(new Customer(3,"Trung","ndtrung@gmail.com","Hai Phong"));
    }
    public List<Customer> showAll(){
        return list;
    }
}
