package Cards;

public class LoyaltyCard {
    String barcode;
    int bonusPoints;

    public LoyaltyCard(String barcode, int bonusPoints) {
        this.barcode = barcode;
        this.bonusPoints = bonusPoints;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }
}
