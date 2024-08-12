import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class StoreGUI {

    // JFrame to hold the main application window
    private JFrame frame;
    // JLabels for various sections and labels in the UI
    private JLabel mainHeading, mainHeading1, mainHeading2, storeId, storeName, location, openingHour, totalSales,
            totalDiscount, productName, markedPrice, vatInsclusivePrice, labelisPaymentOnline, purchasedYear,
            isinsalelaLabel,
            setLoyalltyPointPanelLabel, discountPanelLabel, removeProductPanelLabel;

    // JTextFields for user input in different sections
    private JTextField storeIdFieldForDepartment, storeIdFieldForRetailer, storeIdFieldForSetLoyaltyPoint,
            storeIdFieldForCalculateDiscount, storeIdFieldForRemoveProduct, storeNameFieldForDepartment,
            storeNameFieldForRetailer, locationFieldForDepartment, locationFieldForRetailer,
            openingHourFieldForDepartment, openingHourFieldForRetailer, totalSalesFieldForDepartment,
            totalSalesFieldForRetailer,
            totalDiscountFieldForDepartment, totalDiscountFieldForRetailer, productNameField, markedPriceField,
            vatFieldForRetailer, vatFieldForSetLoyaltyPoint;

    // JCheckBoxes for boolean options
    private JCheckBox isPaymentOnlineForRetailer, isPaymentOnlineForSetLoyaltyPoint, isInSale;
    // JComboBox for selecting the purchased year
    private JComboBox<String> purchasedYearCombo;
    // JButtons for various actions
    private JButton addDepartmentButton, addRetailerButton, calculateDiscountButton, setLoyaltyButton,
            removeProductButton, displayButton, clearButton;
    // JPanels to organize different sections of the GUI
    private JPanel mainPanel, departmentPanel, retailerPanel, bottomPanel, setLoyaltyPointPanel, removeProductPanel,
            calculateDiscountPanel;
    // Fonts for titles and labels
    private Font titleFont, titleFont2, labelFont;
    // Color for labels
    private Color lableColor;

    // array list of store type
    ArrayList<Store> stores = new ArrayList<Store>();

    public StoreGUI() {
        // making frame
        frame = new JFrame("Store GUI");
        frame.setSize(1525, 850);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        // adding fonts and font size
        titleFont = new Font("Arial", Font.BOLD, 20);
        titleFont2 = new Font("Arial", Font.BOLD, 16);
        labelFont = new Font("Arial", Font.PLAIN, 15);

        // setting color
        lableColor = Color.decode("#cbe1df");

        // main heading
        mainHeading = new JLabel("Store Management System");
        mainHeading.setBounds(650, 10, 260, 30);
        mainHeading.setForeground(lableColor);
        mainHeading.setFont(titleFont);
        frame.add(mainHeading);

        // main pannel for background color
        mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 1525, 850);
        mainPanel.setBackground(Color.decode("#222831"));
        mainPanel.setLayout(null);
        frame.add(mainPanel);

        // making department pannel
        departmentPanel = new JPanel();
        departmentPanel.setBounds(50, 55, 470, 550);
        departmentPanel.setBackground(Color.decode("#31363F"));
        departmentPanel.setLayout(null);
        departmentPanel.setBorder(new LineBorder(Color.decode("#E3493B"), 2));
        mainPanel.add(departmentPanel);

        // adding all labels in department pannel:
        // department top label along with its text fields
        mainHeading1 = new JLabel("Add Department Here:");
        mainHeading1.setBounds(175, 10, 200, 30);
        mainHeading1.setForeground(lableColor);
        mainHeading1.setFont(titleFont2);
        departmentPanel.add(mainHeading1);

        // lables for store id
        storeId = new JLabel("Store ID:");
        storeId.setBounds(85, 55, 200, 30);
        storeId.setForeground(lableColor);
        storeId.setFont(labelFont);
        departmentPanel.add(storeId);

        // text field for store id
        storeIdFieldForDepartment = new JTextField();
        storeIdFieldForDepartment.setBounds(195, 55, 160, 25);
        storeIdFieldForDepartment.setBackground(lableColor);
        departmentPanel.add(storeIdFieldForDepartment);

        // lable for store name
        storeName = new JLabel("Store Name:");
        storeName.setBounds(85, 100, 200, 30);
        storeName.setForeground(lableColor);
        storeName.setFont(labelFont);
        departmentPanel.add(storeName);

        // text field for store name
        storeNameFieldForDepartment = new JTextField();
        storeNameFieldForDepartment.setBounds(195, 100, 160, 25);
        storeNameFieldForDepartment.setBackground(lableColor);
        departmentPanel.add(storeNameFieldForDepartment);

        // lable for loaction
        location = new JLabel("Location:");
        location.setBounds(85, 145, 200, 30);
        location.setForeground(lableColor);
        location.setFont(labelFont);
        departmentPanel.add(location);

        // text field for location
        locationFieldForDepartment = new JTextField();
        locationFieldForDepartment.setBounds(195, 145, 160, 25);
        locationFieldForDepartment.setBackground(lableColor);
        departmentPanel.add(locationFieldForDepartment);

        // lable for opening hour
        openingHour = new JLabel("Opening Hour:");
        openingHour.setBounds(85, 190, 200, 30);
        openingHour.setForeground(lableColor);
        openingHour.setFont(labelFont);
        departmentPanel.add(openingHour);

        // text field for opening hour
        openingHourFieldForDepartment = new JTextField();
        openingHourFieldForDepartment.setBounds(195, 190, 160, 25);
        openingHourFieldForDepartment.setBackground(lableColor);
        departmentPanel.add(openingHourFieldForDepartment);

        // lable for total sales
        totalSales = new JLabel("Total Sales:");
        totalSales.setBounds(85, 235, 200, 30);
        totalSales.setForeground(lableColor);
        totalSales.setFont(labelFont);
        departmentPanel.add(totalSales);

        // text field for total sales
        totalSalesFieldForDepartment = new JTextField();
        totalSalesFieldForDepartment.setBounds(195, 235, 160, 25);
        totalSalesFieldForDepartment.setBackground(lableColor);
        departmentPanel.add(totalSalesFieldForDepartment);

        // lable for total discount
        totalDiscount = new JLabel("Total Discount:");
        totalDiscount.setBounds(85, 280, 200, 30);
        totalDiscount.setForeground(lableColor);
        totalDiscount.setFont(labelFont);
        departmentPanel.add(totalDiscount);

        // text field for total discount
        totalDiscountFieldForDepartment = new JTextField();
        totalDiscountFieldForDepartment.setBounds(195, 280, 160, 25);
        totalDiscountFieldForDepartment.setBackground(lableColor);
        departmentPanel.add(totalDiscountFieldForDepartment);

        // lable for total discount
        productName = new JLabel("Product Name:");
        productName.setBounds(85, 325, 200, 30);
        productName.setForeground(lableColor);
        productName.setFont(labelFont);
        departmentPanel.add(productName);

        // text field for total discount
        productNameField = new JTextField();
        productNameField.setBounds(195, 325, 160, 25);
        productNameField.setBackground(lableColor);
        departmentPanel.add(productNameField);

        // lable for Marked Price
        markedPrice = new JLabel("Marked Price:");
        markedPrice.setBounds(85, 370, 200, 30);
        markedPrice.setForeground(lableColor);
        markedPrice.setFont(labelFont);
        departmentPanel.add(markedPrice);

        // text field for Marked Price
        markedPriceField = new JTextField();
        markedPriceField.setBounds(195, 370, 160, 25);
        markedPriceField.setBackground(lableColor);
        departmentPanel.add(markedPriceField);

        // button of add department
        addDepartmentButton = new JButton("Add Department");
        addDepartmentButton.setBounds(165, 470, 155, 40);
        addDepartmentButton.setBackground(Color.decode("#e3b34d"));
        addDepartmentButton.setBorder(new LineBorder(Color.decode("#cbe1df"), 2));

        // LineBorder border = new LineBorder(Color.BLACK, 2);
        // addDepartmentButton.setBorder(border);
        departmentPanel.add(addDepartmentButton);
        addDepartmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                addDepartment();
            }
        });

        // <------------------------------end store panel---------------------------->

        // making retailer pannel
        retailerPanel = new JPanel();
        retailerPanel.setBounds(570, 55, 470, 550);
        retailerPanel.setBackground(Color.decode("#31363F"));
        retailerPanel.setBorder(new LineBorder(Color.decode("#E3493B"), 2));
        retailerPanel.setLayout(null);
        mainPanel.add(retailerPanel);

        // adding all labels in retailer pannel:
        // retailer top label along with it's all text fields
        mainHeading2 = new JLabel("Add Retailer Here: ");
        mainHeading2.setBounds(170, 10, 200, 30);
        mainHeading2.setForeground(lableColor);
        mainHeading2.setFont(titleFont2);
        retailerPanel.add(mainHeading2);

        // lable for store Id
        storeId = new JLabel("Store Id:");
        storeId.setBounds(90, 55, 200, 30);
        storeId.setForeground(lableColor);
        storeId.setFont(labelFont);
        retailerPanel.add(storeId);

        // text field for store id
        storeIdFieldForRetailer = new JTextField();
        storeIdFieldForRetailer.setBounds(235, 55, 160, 25);
        storeIdFieldForRetailer.setBackground(lableColor);
        retailerPanel.add(storeIdFieldForRetailer);

        // lable for Store name
        storeName = new JLabel("Store Name:");
        storeName.setBounds(90, 100, 200, 30);
        storeName.setForeground(lableColor);
        storeName.setFont(labelFont);
        retailerPanel.add(storeName);

        // text field for store name
        storeNameFieldForRetailer = new JTextField();
        storeNameFieldForRetailer.setBounds(235, 100, 160, 25);
        storeNameFieldForRetailer.setBackground(lableColor);
        retailerPanel.add(storeNameFieldForRetailer);

        // lable for location
        location = new JLabel("Loaction:");
        location.setBounds(90, 145, 200, 30);
        location.setForeground(lableColor);
        location.setFont(labelFont);
        retailerPanel.add(location);

        // text field for Location
        locationFieldForRetailer = new JTextField();
        locationFieldForRetailer.setBounds(235, 145, 160, 25);
        locationFieldForRetailer.setBackground(lableColor);
        retailerPanel.add(locationFieldForRetailer);

        // lable for opening hour
        openingHour = new JLabel("Opening Hour: ");
        openingHour.setBounds(90, 190, 200, 30);
        openingHour.setForeground(lableColor);
        openingHour.setFont(labelFont);
        retailerPanel.add(openingHour);

        // checkbox for opening hour
        openingHourFieldForRetailer = new JTextField();
        openingHourFieldForRetailer.setBounds(235, 190, 160, 25);
        openingHourFieldForRetailer.setBackground(lableColor);
        retailerPanel.add(openingHourFieldForRetailer);

        // lable for total sales
        totalSales = new JLabel("Total Sales:");
        totalSales.setBounds(90, 235, 200, 30);
        totalSales.setForeground(lableColor);
        totalSales.setFont(labelFont);
        retailerPanel.add(totalSales);

        // text field for total sales
        totalSalesFieldForRetailer = new JTextField();
        totalSalesFieldForRetailer.setBounds(235, 235, 160, 25);
        totalSalesFieldForRetailer.setBackground(lableColor);
        retailerPanel.add(totalSalesFieldForRetailer);

        // lable for total discount
        totalDiscount = new JLabel("Total Discount:");
        totalDiscount.setBounds(90, 280, 200, 30);
        totalDiscount.setForeground(lableColor);
        totalDiscount.setFont(labelFont);
        retailerPanel.add(totalDiscount);

        // text field for total discount
        totalDiscountFieldForRetailer = new JTextField();
        totalDiscountFieldForRetailer.setBounds(235, 280, 160, 25);
        totalDiscountFieldForRetailer.setBackground(lableColor);
        retailerPanel.add(totalDiscountFieldForRetailer);

        // lable for VAT Inclusive Price
        vatInsclusivePrice = new JLabel("VAT Inclusive Price:");
        vatInsclusivePrice.setBounds(90, 325, 200, 30);
        vatInsclusivePrice.setForeground(lableColor);
        vatInsclusivePrice.setFont(labelFont);
        retailerPanel.add(vatInsclusivePrice);

        // text field for VAT inslusive Price
        vatFieldForRetailer = new JTextField();
        vatFieldForRetailer.setBounds(235, 325, 160, 25);
        vatFieldForRetailer.setBackground(lableColor);
        retailerPanel.add(vatFieldForRetailer);

        // lable for is payment online
        labelisPaymentOnline = new JLabel("Is Payment Online: ");
        labelisPaymentOnline.setBounds(90, 370, 200, 30);
        labelisPaymentOnline.setForeground(lableColor);
        labelisPaymentOnline.setFont(labelFont);
        retailerPanel.add(labelisPaymentOnline);

        // checkbox for is payment online
        isPaymentOnlineForRetailer = new JCheckBox();
        isPaymentOnlineForRetailer.setBounds(235, 373, 18, 15);
        isPaymentOnlineForRetailer.setBackground(lableColor);
        // isPaymentOnline.setBackground(Color.LIGHT_GRAY);
        retailerPanel.add(isPaymentOnlineForRetailer);

        // combobox lable for purchased year
        purchasedYear = new JLabel("Purchased Year: ");
        purchasedYear.setBounds(90, 415, 200, 30);
        purchasedYear.setForeground(lableColor);
        purchasedYear.setFont(labelFont);
        retailerPanel.add(purchasedYear);

        // combobox for purchased year
        purchasedYearCombo = new JComboBox<String>(new String[] { "Year", "2020", "2021", "2022", "2023", "2024" });
        purchasedYearCombo.setBounds(235, 415, 160, 25);
        mainHeading.setForeground(lableColor);
        retailerPanel.add(purchasedYearCombo);

        // button for add retailer
        addRetailerButton = new JButton("Add Retailer");
        addRetailerButton.setBounds(165, 470, 155, 40);
        addRetailerButton.setBackground(Color.decode("#e3b34d"));
        addRetailerButton.setBorder(new LineBorder(Color.decode("#cbe1df"), 2));
        retailerPanel.add(addRetailerButton);
        addRetailerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                addRetailer();
            }
        });

        // <---------------------------------------end retailer
        // panel-------------------------->

        // adding set loyalty panel
        setLoyaltyPointPanel = new JPanel();
        setLoyaltyPointPanel.setBounds(1080, 55, 400, 240);
        setLoyaltyPointPanel.setBackground(Color.decode("#31363F"));
        setLoyaltyPointPanel.setBorder(new LineBorder(Color.decode("#E3493B"), 2));
        setLoyaltyPointPanel.setLayout(null);
        mainPanel.add(setLoyaltyPointPanel);

        // adding all labels in set loyalty panel:
        // set loyalty top label along with its text fields
        setLoyalltyPointPanelLabel = new JLabel("Set Loyalty Point of Retailer:");
        setLoyalltyPointPanelLabel.setBounds(100, 10, 300, 30);
        setLoyalltyPointPanelLabel.setForeground(lableColor);
        setLoyalltyPointPanelLabel.setFont(titleFont2);
        setLoyaltyPointPanel.add(setLoyalltyPointPanelLabel);

        // lables for store id
        storeId = new JLabel("Store ID:");
        storeId.setBounds(55, 55, 200, 30);
        storeId.setForeground(lableColor);
        storeId.setFont(labelFont);
        setLoyaltyPointPanel.add(storeId);

        // text field for store id
        storeIdFieldForSetLoyaltyPoint = new JTextField();
        storeIdFieldForSetLoyaltyPoint.setBounds(195, 55, 160, 25);
        storeIdFieldForSetLoyaltyPoint.setBackground(lableColor);
        setLoyaltyPointPanel.add(storeIdFieldForSetLoyaltyPoint);

        // lable for VAT Inclusive Price
        vatInsclusivePrice = new JLabel("VAT Inclusive Price:");
        vatInsclusivePrice.setBounds(55, 100, 200, 30);
        vatInsclusivePrice.setForeground(lableColor);
        vatInsclusivePrice.setFont(labelFont);
        setLoyaltyPointPanel.add(vatInsclusivePrice);

        // text field for VAT inslusive Price
        vatFieldForSetLoyaltyPoint = new JTextField();
        vatFieldForSetLoyaltyPoint.setBounds(195, 100, 160, 25);
        vatFieldForSetLoyaltyPoint.setBackground(lableColor);
        setLoyaltyPointPanel.add(vatFieldForSetLoyaltyPoint);

        // lable for is payment online
        labelisPaymentOnline = new JLabel("Is Payment Online: ");
        labelisPaymentOnline.setBounds(55, 145, 200, 30);
        labelisPaymentOnline.setForeground(lableColor);
        labelisPaymentOnline.setFont(labelFont);
        setLoyaltyPointPanel.add(labelisPaymentOnline);

        // checkbox for is payment online
        isPaymentOnlineForSetLoyaltyPoint = new JCheckBox();
        isPaymentOnlineForSetLoyaltyPoint.setBounds(195, 152, 18, 15);
        isPaymentOnlineForSetLoyaltyPoint.setBackground(lableColor);
        // isPaymentOnline.setBackground(Color.LIGHT_GRAY);
        setLoyaltyPointPanel.add(isPaymentOnlineForSetLoyaltyPoint);

        // button for set loyalty point
        setLoyaltyButton = new JButton("Set Loyalty Point");
        setLoyaltyButton.setBounds(145, 190, 130, 25);
        // setLoyaltyButton.setBackground(Color.ORANGE);
        setLoyaltyButton.setBackground(Color.decode("#e3b34d"));
        setLoyaltyButton.setBorder(new LineBorder(Color.decode("#cbe1df"), 2));
        setLoyaltyPointPanel.add(setLoyaltyButton);
        setLoyaltyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setLoyalltyPoint();
            }
        });

        // <---------------------------------setLoyalltyPointPanel end here
        // ------------------------->

        // adding calculate discount panel
        calculateDiscountPanel = new JPanel();
        calculateDiscountPanel.setBounds(1080, 310, 400, 140);
        calculateDiscountPanel.setBackground(Color.decode("#31363F"));
        calculateDiscountPanel.setBorder(new LineBorder(Color.decode("#E3493B"), 2));
        calculateDiscountPanel.setLayout(null);
        mainPanel.add(calculateDiscountPanel);

        // adding all labels in calculate discount panel:
        // calculate discount top label along with its text fields
        discountPanelLabel = new JLabel("Calculate Discount Of Department:");
        discountPanelLabel.setBounds(95, 5, 300, 30);
        discountPanelLabel.setForeground(lableColor);
        discountPanelLabel.setFont(titleFont2);
        calculateDiscountPanel.add(discountPanelLabel);

        // lable for store Id
        storeId = new JLabel("Store Id:");
        storeId.setBounds(100, 38, 200, 30);
        storeId.setForeground(lableColor);
        storeId.setFont(labelFont);
        calculateDiscountPanel.add(storeId);

        // text field for store id
        storeIdFieldForCalculateDiscount = new JTextField();
        storeIdFieldForCalculateDiscount.setBounds(195, 38, 160, 25);
        storeIdFieldForCalculateDiscount.setBackground(lableColor);
        calculateDiscountPanel.add(storeIdFieldForCalculateDiscount);

        // lable for is in sale
        isinsalelaLabel = new JLabel("Is In Sale: ");
        isinsalelaLabel.setBounds(100, 70, 200, 30);
        isinsalelaLabel.setForeground(lableColor);
        isinsalelaLabel.setFont(labelFont);
        calculateDiscountPanel.add(isinsalelaLabel);

        // checkbox for is in sale
        isInSale = new JCheckBox();
        isInSale.setBounds(225, 78, 18, 15);
        isInSale.setBackground(lableColor);
        // isInSale.setBackground(Color.LIGHT_GRAY);
        calculateDiscountPanel.add(isInSale);

        // button of calculate discount
        calculateDiscountButton = new JButton("Calculate Discount");
        calculateDiscountButton.setBounds(135, 105, 145, 25);
        // calculateDiscountButton.setBackground(Color.ORANGE);
        calculateDiscountButton.setBackground(Color.decode("#e3b34d"));
        calculateDiscountButton.setBorder(new LineBorder(Color.decode("#cbe1df"), 2));
        calculateDiscountPanel.add(calculateDiscountButton);
        calculateDiscountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculateDiscount();
            }
        });

        // <------------------------------------calculateDiscountPanel ends
        // here------------------------->

        // adding remove product pannel
        removeProductPanel = new JPanel();
        removeProductPanel.setBounds(1080, 465, 400, 140);
        removeProductPanel.setBackground(Color.decode("#31363F"));
        removeProductPanel.setBorder(new LineBorder(Color.decode("#E3493B"), 2));
        removeProductPanel.setLayout(null);
        mainPanel.add(removeProductPanel);

        // adding all labels in remove product pannel:
        // remove product top label along with its text fields
        removeProductPanelLabel = new JLabel("Remove Product of Retailer:");
        removeProductPanelLabel.setBounds(100, 10, 300, 30);
        removeProductPanelLabel.setForeground(lableColor);
        removeProductPanelLabel.setFont(titleFont2);
        removeProductPanel.add(removeProductPanelLabel);

        // lables for store id
        storeId = new JLabel("Store ID:");
        storeId.setBounds(85, 55, 200, 30);
        storeId.setForeground(lableColor);
        storeId.setFont(labelFont);
        removeProductPanel.add(storeId);

        // text field for store id
        storeIdFieldForRemoveProduct = new JTextField();
        storeIdFieldForRemoveProduct.setBounds(195, 55, 160, 25);
        storeIdFieldForRemoveProduct.setBackground(lableColor);
        removeProductPanel.add(storeIdFieldForRemoveProduct);

        // button of remove product
        removeProductButton = new JButton("Remove Product");
        removeProductButton.setBounds(135, 95, 145, 30);
        // removeProductButton.setBackground(Color.RED);
        removeProductButton.setForeground(Color.WHITE);
        removeProductButton.setBackground(Color.decode("#E3493B"));
        removeProductButton.setBorder(new LineBorder(Color.decode("#cbe1df"), 2));
        removeProductPanel.add(removeProductButton);
        removeProductButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                removeProduct();
            }
        });

        // <--------------------------------------removeProductPanel ends here
        // ------------------------>
        // adding bottom panel
        bottomPanel = new JPanel();
        bottomPanel.setBounds(365, 640, 850, 130);
        bottomPanel.setBackground(Color.decode("#31363F"));
        bottomPanel.setBorder(new LineBorder(Color.decode("#E3493B"), 2));
        // bottomPanel.setBackground(Color.lightGray);
        bottomPanel.setLayout(null);
        mainPanel.add(bottomPanel);

        // adding buttons on bottom pannel
        // clear button:
        clearButton = new JButton("Clear");
        clearButton.setBounds(80, 55, 150, 35);
        clearButton.setBackground(Color.decode("#E3493B"));
        clearButton.setForeground(Color.WHITE);
        clearButton.setBorder(new LineBorder(Color.decode("#cbe1df"), 2));
        bottomPanel.add(clearButton);
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                clear();
            }
        });
        // display buutton:
        displayButton = new JButton("Display");
        displayButton.setBounds(640, 55, 150, 35);
        displayButton.setBackground(Color.decode("#e3b34d"));
        displayButton.setBorder(new LineBorder(Color.decode("#cbe1df"), 2));
        bottomPanel.add(displayButton);
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                display();
            }
        });

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new StoreGUI();
    }

    public void addDepartment() {
        // Retrieve input fields
        String storeIdText = storeIdFieldForDepartment.getText();
        String storeName = storeNameFieldForDepartment.getText();
        String location = locationFieldForDepartment.getText();
        String openingHour = openingHourFieldForDepartment.getText();
        String totalSalesText = totalSalesFieldForDepartment.getText();
        String totalDiscountText = totalDiscountFieldForDepartment.getText();
        String productName = productNameField.getText();
        String markedPriceText = markedPriceField.getText();

        // Validate inputs
        if (storeIdText.isEmpty() || storeName.isEmpty() || location.isEmpty() ||
                openingHour.isEmpty() || totalSalesText.isEmpty() ||
                totalDiscountText.isEmpty() || productName.isEmpty() || markedPriceText.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Input Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            // Convert inputs to appropriate types
            int storeId = Integer.parseInt(storeIdText);
            double totalSales = Double.parseDouble(totalSalesText);
            double totalDiscount = Double.parseDouble(totalDiscountText);
            double markedPrice = Double.parseDouble(markedPriceText);

            // Check if the store ID already exists in the ArrayList
            boolean idExists = false;
            for (Store store : stores) {
                if (store.getStoreId() == storeId) {
                    idExists = true;
                    break;
                }
            }

            if (idExists) {
                JOptionPane.showMessageDialog(frame,
                        "Store ID already exists. Please choose a different ID.",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Create a new Department object
            Department department = new Department(storeId, storeName, location, openingHour, totalSales,
                    totalDiscount, productName, markedPrice);

            // Add the new Department object to the ArrayList
            stores.add(department);

            // Show confirmation message
            JOptionPane.showMessageDialog(frame, "Department added successfully.", "Success",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid number format. Please check your input.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "An error occurred: \nTry again! " + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void addRetailer() {
        // Retrieve text from fields
        String storeIdText = storeIdFieldForRetailer.getText();
        String storeName = storeNameFieldForRetailer.getText();
        String location = locationFieldForRetailer.getText();
        String openingHour = openingHourFieldForRetailer.getText();
        String totalSalesText = totalSalesFieldForRetailer.getText();
        String totalDiscountText = totalDiscountFieldForRetailer.getText();
        String vatInclusivePriceText = vatFieldForRetailer.getText();
        boolean paymentOnline = isPaymentOnlineForRetailer.isSelected();
        String purchasedYear = (String) purchasedYearCombo.getSelectedItem();

        // Check for empty fields
        if (storeIdText.isEmpty() || storeName.isEmpty() || location.isEmpty() || openingHour.isEmpty() ||
                totalSalesText.isEmpty() || totalDiscountText.isEmpty() || vatInclusivePriceText.isEmpty() ||
                purchasedYear == "Year") {

            JOptionPane.showMessageDialog(frame, "Please fill in all required fields.", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Parse numeric fields
            int storeId = Integer.parseInt(storeIdText);
            double totalSales = Double.parseDouble(totalSalesText);
            double totalDiscount = Double.parseDouble(totalDiscountText);
            double vatInclusivePrice = Double.parseDouble(vatInclusivePriceText);

            // Check if the store ID already exists in the ArrayList
            boolean idExists = false;
            for (Store store : stores) {
                if (store.getStoreId() == storeId) {
                    idExists = true;
                    break;
                }
            }

            if (idExists) {
                JOptionPane.showMessageDialog(frame,
                        "Store ID already exists. Please choose a different ID.",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Create Retailer object and add to stores list
            Retailer retailer = new Retailer(storeId, storeName, location, openingHour, totalSales,
                    totalDiscount, vatInclusivePrice, paymentOnline, purchasedYear);
            stores.add(retailer);

            // Show confirmation message
            JOptionPane.showMessageDialog(frame, "Retailer added successfully.", "Success",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            // Handle invalid number format
            JOptionPane.showMessageDialog(frame, "Please enter valid numbers for the numeric fields.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception a) {
            JOptionPane.showMessageDialog(frame, "Unexpected Error Occur.\n Try Again!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void setLoyalltyPoint() {
        try {
            // Retrieve and validate input fields
            String storeIdText = storeIdFieldForSetLoyaltyPoint.getText();
            String vatText = vatFieldForSetLoyaltyPoint.getText();
            boolean isPaymentOnline = isPaymentOnlineForSetLoyaltyPoint.isSelected();

            if (storeIdText.isEmpty() || vatText.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill in all required fields.", "Input Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Parse numeric fields
            int storeId = Integer.parseInt(storeIdText);
            double vatInclusivePrice = Double.parseDouble(vatText);

            // Find the store and set loyalty points
            boolean storeFound = false;
            for (Store store : stores) {
                if (store instanceof Retailer && store.getStoreId() == storeId) {
                    Retailer retailer = (Retailer) store;

                    // Provide a confirmation message showing details
                    int sure = JOptionPane.showConfirmDialog(frame,
                            "Are you sure you want to set the loyalty points for Store ID " + storeId +
                                    "\nVAT Inclusive Price: " + vatInclusivePrice +
                                    "\nPayment Online: " + isPaymentOnline,
                            "Confirmation", JOptionPane.YES_NO_OPTION);

                    if (sure == JOptionPane.YES_OPTION) {
                        // Set loyalty points
                        retailer.setLoyaltyPoint(isPaymentOnline, vatInclusivePrice);
                        JOptionPane.showMessageDialog(frame,
                                "Loyalty points set successfully for Store ID " + storeId, "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Operation canceled.", "Cancelled!",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    storeFound = true;
                    break;
                }
            }

            // Handle cases where store ID is not found or is not a Retailer
            if (!storeFound) {
                JOptionPane.showMessageDialog(frame, "Store ID not found or is not a Retailer.", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numerical values.", "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public void calculateDiscount() {
        try {
            // Retrieve and validate input fields
            String storeIdText = storeIdFieldForCalculateDiscount.getText();
            String markedPriceText = markedPriceField.getText();

            if (storeIdText.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Input Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Parse numeric fields
            int storeId = Integer.parseInt(storeIdText);
            double markedPrice = Double.parseDouble(markedPriceText);

            // Check if the store ID exists and is a Department
            boolean storeFound = false;
            for (Store store : stores) {
                if (store.getStoreId() == storeId) {
                    if (store instanceof Department) {
                        Department department = (Department) store;

                        // Check if the department is in sale
                        if (isInSale.isSelected()) {
                            // Calculate discount price
                            department.calculateDiscountPrice(isInSale.isSelected(),
                                    markedPrice);
                            JOptionPane.showMessageDialog(frame,
                                    "Discount Price Calculated for Store ID " + storeId,
                                    "Discount Calculated", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(frame,
                                    "Discount calculation is only allowed if the store is in sale.",
                                    "Invalid Operation", JOptionPane.ERROR_MESSAGE);
                        }

                        storeFound = true;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(frame,
                                "Store ID exists but is not a Department.", "Invalid Store Type",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }

            // Handle cases where store ID is not found
            if (!storeFound) {
                JOptionPane.showMessageDialog(frame, "Store ID not found.", "Store Not Found",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid number format. Please check your input.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void removeProduct() {
        try {
            // Retrieve and validate input field
            String storeIdText = storeIdFieldForRemoveProduct.getText();
            if (storeIdText.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill in the Store ID.", "Input Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Parse the store ID
            int storeId = Integer.parseInt(storeIdText);
            boolean storeFound = false;

            // Search for the store with the given ID
            for (Store store : stores) {
                if (store.getStoreId() == storeId) {
                    if (store instanceof Retailer) {
                        Retailer retailer = (Retailer) store;

                        // Provide confirmation message
                        int sure = JOptionPane.showConfirmDialog(frame,
                                "Are you sure you want to remove the product from Store ID " + storeId +
                                        "\nVAT Inclusive Price: " + retailer.getVatInclusivePrice() +
                                        "\nLoyalty Points: " + retailer.getLoyaltyPoint() +
                                        "\nPurchased Year: " + retailer.getPurchasedYear(),
                                "Confirm", JOptionPane.YES_NO_OPTION);

                        if (sure == JOptionPane.YES_OPTION) {
                            // Check conditions for removing product
                            if (retailer.getLoyaltyPoint() == 0 &&
                                    (retailer.getPurchasedYear().equals("2020") ||
                                            retailer.getPurchasedYear().equals("2021") ||
                                            retailer.getPurchasedYear().equals("2022"))) {
                                try {
                                    retailer.removeProduct();
                                    JOptionPane.showMessageDialog(frame,
                                            "Product removed successfully from Store ID " + storeId,
                                            "Success", JOptionPane.INFORMATION_MESSAGE);
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(frame,
                                            "Error removing product: " + e.getMessage(),
                                            "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(frame,
                                        "Product cannot be removed. Ensure loyalty points are zero and purchased year is valid.",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(frame, "Operation cancelled.", "Cancelled",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }

                        storeFound = true;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(frame,
                                "Store ID is not a Retailer.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }

            if (!storeFound) {
                JOptionPane.showMessageDialog(frame, "Store ID not found.", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid Store ID. Please enter a valid number.", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void clear() {
        boolean isAnyFieldNotEmpty = !storeIdFieldForDepartment.getText().isEmpty() ||
                !storeNameFieldForDepartment.getText().isEmpty() ||
                !locationFieldForDepartment.getText().isEmpty() ||
                !openingHourFieldForDepartment.getText().isEmpty() ||
                !totalSalesFieldForDepartment.getText().isEmpty() ||
                !totalDiscountFieldForDepartment.getText().isEmpty() ||
                !productNameField.getText().isEmpty() ||
                !markedPriceField.getText().isEmpty() ||
                !storeIdFieldForRetailer.getText().isEmpty() ||
                !storeNameFieldForRetailer.getText().isEmpty() ||
                !locationFieldForRetailer.getText().isEmpty() ||
                !openingHourFieldForRetailer.getText().isEmpty() ||
                !totalSalesFieldForRetailer.getText().isEmpty() ||
                !totalDiscountFieldForRetailer.getText().isEmpty() ||
                !vatFieldForRetailer.getText().isEmpty() ||
                isPaymentOnlineForRetailer.isSelected() ||
                purchasedYearCombo.getSelectedIndex() != 0 ||
                !storeIdFieldForSetLoyaltyPoint.getText().isEmpty() ||
                !vatFieldForSetLoyaltyPoint.getText().isEmpty() ||
                isPaymentOnlineForSetLoyaltyPoint.isSelected() ||
                !storeIdFieldForCalculateDiscount.getText().isEmpty() ||
                isInSale.isSelected() ||
                !storeIdFieldForRemoveProduct.getText().isEmpty();

        if (isAnyFieldNotEmpty) {
            // Clear department panel fields
            storeIdFieldForDepartment.setText("");
            storeNameFieldForDepartment.setText("");
            locationFieldForDepartment.setText("");
            openingHourFieldForDepartment.setText("");
            totalSalesFieldForDepartment.setText("");
            totalDiscountFieldForDepartment.setText("");
            productNameField.setText("");
            markedPriceField.setText("");

            // Clear retailer panel fields
            storeIdFieldForRetailer.setText("");
            storeNameFieldForRetailer.setText("");
            locationFieldForRetailer.setText("");
            openingHourFieldForRetailer.setText("");
            totalSalesFieldForRetailer.setText("");
            totalDiscountFieldForRetailer.setText("");
            vatFieldForRetailer.setText("");
            isPaymentOnlineForRetailer.setSelected(false);
            purchasedYearCombo.setSelectedIndex(0);

            // Clear set loyalty point panel fields
            storeIdFieldForSetLoyaltyPoint.setText("");
            vatFieldForSetLoyaltyPoint.setText("");
            isPaymentOnlineForSetLoyaltyPoint.setSelected(false);

            // Clear calculate discount panel fields
            storeIdFieldForCalculateDiscount.setText("");
            isInSale.setSelected(false);

            // Clear remove product panel fields
            storeIdFieldForRemoveProduct.setText("");
        } else {
            JOptionPane.showMessageDialog(frame, "Fields are already cleared.", "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void display() {
        // Check if the stores list is empty
        if (stores.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "No stores have been added.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Iterate over the list and display each store's details
        for (Store store : stores) {
            System.out.println("\n-------------------------------------------------");
            // Calls the appropriate display method depending on the actual object type
            store.display();
            System.out.println("-------------------------------------------------\n");
        }
        // Display all store details in a JOptionPane dialog
        JOptionPane.showMessageDialog(frame, "Store Details are printed in the terminal", "Store Details",
                JOptionPane.INFORMATION_MESSAGE);
    }
}