package Customers;

import Cards.LoyaltyCard;

public class Customer {

    String customerName;
    LoyaltyCard loyaltyCard;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public Customer(String customerName, LoyaltyCard loyaltyCard){
        this.customerName = customerName;
        this.loyaltyCard = loyaltyCard;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }
}
