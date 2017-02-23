package Groceries;

import java.util.HashMap;
import java.util.Map;


public class GroceriesRepository {

    private Map<String, Integer> shoppingCart;

    public GroceriesRepository() {
        this.shoppingCart = new HashMap<>();
    }

    public void addItemToCart(String item, Integer quantity) {
        if (shoppingCart.containsKey(item)) {
            int temp = shoppingCart.get(item);
            shoppingCart.put(item, temp + quantity);
        } else {
            shoppingCart.put(item, quantity);
        }
    }

    public Map<String, Integer> getShoppingCart() {
        return shoppingCart;
    }
}
