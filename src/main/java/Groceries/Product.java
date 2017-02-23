package groceries;

/**
 * Created by stijnli on 23/02/2017.
 */
public class Product {

    private String description;
    private double price;

    public Product(String description, double price){
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
