package groceries;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by stijnli on 23/02/2017.
 */
public class ShoppingCartTest {
    ShoppingCart shoppingCart;
    @Before
    public void Set_Up(){
        shoppingCart = new ShoppingCart();
        shoppingCart.addItemToCart("fruit", 5);
        shoppingCart.addItemToCart("vegetable", 1);
        shoppingCart.addItemToCart("cereal", 3);
    }

    @Test
    public void addItemToCart_AddsItems(){
        Assertions.assertThat(shoppingCart.getShoppingCart()).containsKeys("fruit", "vegetable", "cereal");
    }


}
