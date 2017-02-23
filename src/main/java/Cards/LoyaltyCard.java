package Cards;

public class LoyaltyCard {
    String barcode;
    int bonuspoints;

    public LoyaltyCard(String barcode, int bonuspoints) {
        this.barcode = barcode;
        this.bonuspoints = bonuspoints;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getBonuspoints() {
        return bonuspoints;
    }
}
