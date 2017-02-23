package Customers;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryTest {

    CustomerRepository customerRepo = new CustomerRepository();

    @Test
    public void addCustomerToRepositoryTest(){
        Customer cus = new Customer("Elise");
        customerRepo.addCustomer(cus);
        List<Customer> customerTestList = new ArrayList<>();
        customerTestList.add(cus);

        Assertions.assertThat(customerRepo.getCustomers()).isEqualTo(customerTestList);
    }

  


}
