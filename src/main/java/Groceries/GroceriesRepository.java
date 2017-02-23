package Groceries;

import java.util.ArrayList;
import java.util.List;


public class GroceriesRepository {

    List<Product> repository = new ArrayList<>();

    public void addProduct(Product product) {
        if(product != null){
            repository.add(product);
        }
    }

    public List<Product> getAllGroceries() {
        return repository;
    }
}
