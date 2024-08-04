//declaring the Store class
public class Store
{
    //declaring the class attributes
    private int storeId;
    private String storeName;
    private String location;
    private String openingHour;
    private double totalSales;
    private double totalDiscount;

    //constructor with the parameters
    public Store(int storeId, String storeName, String location, String openingHour)
    {
        //assiging parameter values to the corresponding attributes
        this.storeId = storeId;
        this.storeName = storeName;
        this.location = location;
        this.openingHour = openingHour;
        //initallizing 0 to the corresponding attributes
        totalSales = 0;
        totalDiscount = 0;
    }

    //get method
    //accessor method (getter method) for corresponding attributes
    public int getStoreId() 
    {
        return storeId;
    }

    public String getStoreName() 
    {
        return storeName;
    }

    public String getLocation() 
    {
        return location;
    }

    public String getOpeningHour() 
    {
        return openingHour;
    }

    public double getTotalSales() 
    {
        return totalSales;
    }

    public double getTotalDiscount() 
    {
        return totalDiscount;
    }

    //set method
    //method to set total sales and acceps a new totl sales as parameter (mutator method)
    public void setTotalSales(double newTotalSales) 
    {
        totalSales = totalSales + newTotalSales;
    }
    //method to set total discount and accepts new discount as parameter
    public void setTotalDiscount(double newDiscount) 
    {
        totalDiscount = totalDiscount + newDiscount;
    }

    //display method to output store details
    public void display() 
    {
        //output store details
        System.out.println("Store ID: " + storeId);
        System.out.println("Store Name: " + storeName);
        System.out.println("Location: " + location);
        System.out.println("Opening Hour: " + openingHour);
        //checking if the sales and discounts price is 0 or not
        if (totalSales == 0.0 && totalDiscount == 0.0) 
        {
            System.out.println("No sales and discounts have been recorded yet in the store.");
        }
        else 
        {
            System.out.println("Sales and discount have been recorded in the store. And the details are below: ");
            //displaying the recorded sales and discount in the store
            System.out.println("Total Sales: " + totalSales);
            System.out.println("Total Discount: " + totalDiscount);
        }
    }
}