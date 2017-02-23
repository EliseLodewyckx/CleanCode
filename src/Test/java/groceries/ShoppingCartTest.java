package groceries;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by stijnli on 23/02/2017.
 */
public class ShoppingCartTest {
    ShoppingCart shoppingCart;
    Product fruit;
    Product vegetable;
    Product cereal;

    @Before
    public void Set_Up(){
        shoppingCart = new ShoppingCart();
        fruit = new Product("fruit");
        vegetable = new Product("vegetable");
        cereal = new Product("cereal");

        shoppingCart.addItemToCart(fruit, 5);
        shoppingCart.addItemToCart(vegetable, 1);
        shoppingCart.addItemToCart(cereal, 3);
    }

    @Test
    public void addItemToCart_AddsItems(){
        Assertions.assertThat(shoppingCart.getShoppingCart()).containsKeys(fruit, vegetable, cereal);
    }


}
