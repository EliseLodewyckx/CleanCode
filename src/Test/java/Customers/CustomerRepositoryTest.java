package Customers;

import Cards.LoyaltyCard;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryTest {

    CustomerRepository customerRepo = new CustomerRepository();
    Customer cus1 = new Customer("Elise", new LoyaltyCard("123", 5));
    Customer cus2 = new Customer("Stijn", new LoyaltyCard("456", 2));
    Customer cus3 = new Customer("Paulien", new LoyaltyCard("789", 9));

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void fillCustomerRepoWithCustomers(){
        customerRepo.addCustomer(cus1);
        customerRepo.addCustomer(cus2);
        customerRepo.addCustomer(cus3);
    }

    @Test
    public void addCustomerToRepositoryTest(){
        CustomerRepository repoForThisTest = new CustomerRepository();
        Customer cus = new Customer("Elise");
        repoForThisTest.addCustomer(cus);
        List<Customer> customerTestList = new ArrayList<>();
        customerTestList.add(cus);

        Assertions.assertThat(repoForThisTest.getCustomers()).isEqualTo(customerTestList);
    }



    @Test
    public void findCustomerByBarcodeLoyaltyCardTest() throws Exception {
        Assertions.assertThat(customerRepo.findCustomerByBarcode("456")).isEqualTo(cus2);
    }

    @Test
    public void searchingForNonExistingCustomer_ThrowsException() throws Exception {
        
    }


}
