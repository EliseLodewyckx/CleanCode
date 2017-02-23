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

    public Customer findCustomerByBarcode(String barcode) {
        Customer customerToReturn = null;
        for (Customer cus : customers) {
            String barcodeCustomer = cus.getLoyaltyCard().getBarcode();
            if(barcodeCustomer.equals(barcode)){
                customerToReturn = cus;
            }
        }
        return customerToReturn;
    }
}
