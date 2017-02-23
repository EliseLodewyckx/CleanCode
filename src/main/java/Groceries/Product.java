package Groceries;

/**
 * Created by stijnli on 23/02/2017.
 */
public class Product {

    public String description;
    public  double price;

    public Product(){
        description = "generic product";
        price = 0.0;
    }

    public Product(String description, double price){
        this.description = description;
        this.price = price;

    }

}
