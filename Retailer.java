public class Retailer extends Store {
    // Attributes specific to Retailer class
    private double vatInclusivePrice; // Changed to double
    private int loyaltyPoint;
    private boolean isPaymentOnline;
    private String purchasedYear;

    // Constructor with parameters including attributes from superclass and
    // additional attributes
    public Retailer(int storeId, String storeName, String location, String openingHour, double totalSales,
            double totalDiscount,
            double vatInclusivePrice, boolean isPaymentOnline, String purchasedYear) {
        // Calling superclass constructor to initialize superclass attributes
        super(storeId, storeName, location, openingHour);
        // Initializing total sales and total discount using setter methods in
        // superclass
        setTotalSales(totalSales);
        setTotalDiscount(totalDiscount);
        // Initializing additional attributes specific to Retailer class
        this.vatInclusivePrice = vatInclusivePrice;
        this.isPaymentOnline = isPaymentOnline;
        this.purchasedYear = purchasedYear;
        // Loyalty point set to zero initially
        this.loyaltyPoint = 0;
    }

    // Accessor methods for Retailer attributes
    public double getVatInclusivePrice() {
        return vatInclusivePrice;
    }

    public int getLoyaltyPoint() {
        return loyaltyPoint;
    }

    public boolean isPaymentOnline() {
        return isPaymentOnline;
    }

    public String getPurchasedYear() {
        return purchasedYear;
    }

    // Mutator method for isPaymentOnline
    public void setPaymentOnline(boolean isPaymentOnline) {
        this.isPaymentOnline = isPaymentOnline;
    }

    // Method to set loyalty point based on online payment and VAT inclusive price
    public void setLoyaltyPoint(boolean isPaymentOnline, double vatInclusivePrice) { // Changed to double
        if (isPaymentOnline) {
            // Calculate loyalty point as 1% of VAT inclusive price
            this.loyaltyPoint = (int) (vatInclusivePrice / 100);
        } else {
            // Reset loyalty point if payment is not online
            this.loyaltyPoint = 0;
        }
    }

    // Method to remove product based on conditions and reset attributes
    public void removeProduct() {
        if (loyaltyPoint == 0
                && (purchasedYear.equals("2020") || purchasedYear.equals("2021") || purchasedYear.equals("2022"))) {
            // Reset attributes
            vatInclusivePrice = 0;
            loyaltyPoint = 0;
            isPaymentOnline = false;
        }
    }

    // Method override to display retailer details
    @Override
    public void display() {
        super.display();
        System.out.println("VAT Inclusive Price: " + vatInclusivePrice);
        System.out.println("Loyalty Point: " + loyaltyPoint);
        System.out.println("Purchased Year: " + purchasedYear);
        System.out.println("Is Payment Online: " + isPaymentOnline);
        if (vatInclusivePrice == 0 && loyaltyPoint == 0 && !isPaymentOnline) {
            System.out.println("Product has been removed.");
        }
    }
}
