package customers;

import cards.LoyaltyCard;
import groceries.GroceriesRepository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Customer {

    String customerName;
    LoyaltyCard loyaltyCard;
    private Map<LocalDate, GroceriesRepository> groceryHistory;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.groceryHistory = new HashMap<>();
    }

    public Customer(String customerName, LoyaltyCard loyaltyCard){
        this.customerName = customerName;
        this.loyaltyCard = loyaltyCard;
        this.groceryHistory = new HashMap<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }

    public void addGrocery(LocalDate date, GroceriesRepository grocery) throws Exception {
        if (groceryHistory.containsKey(date)) {
            throw new Exception("Not allowed to go shopping multiple times a day");
        } else {
            groceryHistory.put(date, grocery);
        }
    }
}
