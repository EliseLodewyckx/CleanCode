package Customers;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    public List<Customer> customers = new ArrayList<>();

    public List<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer cus){
            customers.add(cus);
    }
}
