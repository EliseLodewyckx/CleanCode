package customers;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    public List<Customer> customers = new ArrayList<>();

    public List<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer){
            customers.add(customer);
    }

    public Customer findCustomerByBarcode(String barcode) throws Exception {

        for (Customer customer : customers) {
            if(customer.getBarcode().equals(barcode)){
                return customer;
            }
        }
        throw new Exception("No customer found");
    }

}
