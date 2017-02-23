package Groceries;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by stijnli on 23/02/2017.
 */
public class GroceriesRepositoryTest {
    GroceriesRepository repository;
    @Before
    public void Set_Up(){
        repository = new GroceriesRepository();
        Product p1 = new Product("confituur",2.50);
        Product p2 = new Product("choco",3.50);
        Product p3 = new Product("ice tea",2.00);
        repository.addProduct(p1);
        repository.addProduct(p2);
        repository.addProduct(p3);
    }

    @Test
    public void addProduct_AddsProduct(){
        Product p4 = new Product("brood",2.50);
        repository.addProduct(p4);
        Assertions.assertThat(repository.getAllGroceries().contains(p4));
    }
}
