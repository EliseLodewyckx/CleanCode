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
        repository.addItemToCart("fruit", 5);
        repository.addItemToCart("vegetable", 1);
        repository.addItemToCart("cereal", 3);
    }

    @Test
    public void addItemToCart_AddsItems(){
        Assertions.assertThat(repository.getShoppingCart()).containsKeys("fruit", "vegetable", "cereal");
    }


}
