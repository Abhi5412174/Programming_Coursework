// Department class representing a store
public class Department extends Store {
    private String productName;
    private double markedPrice;
    private double sellingPrice;
    private boolean isInSales;

    // Constructor with parameters including attributes from superclass and
    // additional attributes
    public Department(int storeId, String storeName, String location, String openingHour, double totalSales,
            double totalDiscount, String productName, double markedPrice) {
        // Calling superclass constructor to initialize superclass attributes
        super(storeId, storeName, location, openingHour);
        // Initializing total sales and total discount using setter methods in
        // superclass
        setTotalSales(totalSales);
        setTotalDiscount(totalDiscount);
        // Initializing additional attributes specific to Department class
        this.productName = productName;
        this.markedPrice = markedPrice;
        // Default value for selling price
        this.sellingPrice = 0;
        this.isInSales = true;
    }

    // Accessor methods for Department attributes
    public String getProductName() {
        return productName;
    }

    public double getMarkedPrice() {
        return markedPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public boolean isInSales() {
        return isInSales;
    }

    // Mutator method for marked price
    public void setMarkedPrice(double markedPrice) {
        this.markedPrice = markedPrice;
    }

    // Method to calculate selling price and update attributes
    public void calculateDiscountPrice(boolean isInSales, double markedPrice) {
        this.isInSales = isInSales;
        // If the product is available for sale, calculate discount and update selling
        // price
        if (isInSales) {
            double discount = 0;
            // Determine discount percentage based on marked price
            if (markedPrice >= 5000) {
                discount = 0.2;
            } else if (markedPrice >= 3000) {
                discount = 0.1;
            } else if (markedPrice >= 1000) {
                discount = 0.05;
            }
            // Calculate discount amount and update selling price
            double discountAmount = markedPrice * discount;
            sellingPrice = markedPrice - discountAmount;
            // Update total discount and total sales in superclass
            setTotalDiscount(discountAmount);
            // Assuming selling price is added to total sales
            setTotalSales(sellingPrice);
            // the attribute isInSales is set to false.
            this.isInSales = false;
        } else {
            // If the product is not available for sale, set selling price to marked price
            sellingPrice = markedPrice;
        }
    }

    // Method override to display department details
    @Override
    public void display() {
        // Display superclass details using superclass display method
        super.display();
        // Display additional details specific to Department class
        System.out.println("Product Name: " + productName);
        // If the product is available for sale, display marked price
        if (isInSales) {
            System.out.println("Marked Price: " + markedPrice);
        } else {
            // If the product is not available for sale, display selling price
            System.out.println("Selling Price: " + sellingPrice);
        }
    }
}