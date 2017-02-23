package customers;

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

    public Customer findCustomerByBarcode(String barcode) throws Exception {

        for (Customer cus : customers) {
            if(getBarcode(cus).equals(barcode)){
                return cus;
            }
        }
        throw new Exception("No customer found");
    }

    private String getBarcode(Customer cus) {
        return cus.getLoyaltyCard().getBarcode();
    }
}
