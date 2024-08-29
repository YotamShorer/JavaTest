import java.util.ArrayList;

public class Customer {
    public enum CustomerType {Regular, VIP};

    private String customerId;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private Address customerDelivaryAddress;
    private CustomerType customerType;
    private Double customerDiscount;
    private ArrayList<Item> customerFavoriteItem = new ArrayList<>();
    private Gift gift;

    public Customer(String customerId, String customerFirstName, String customerLastName, String customerEmail, Address customerDelivaryAddress, CustomerType customerType, Double customerDiscount) {
            this.customerId = customerId;
            this.customerFirstName = customerFirstName;
            this.customerLastName = customerLastName;
            this.customerEmail = customerEmail;
            this.customerDelivaryAddress = customerDelivaryAddress;
            this.customerType = customerType;
            this.customerDiscount = customerDiscount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public Address getCustomerDelivaryAddress() {
        return customerDelivaryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public double getCustomerDiscount() {
        return customerDiscount;
    }

    public ArrayList<Item> getCustomerFavoriteItem() {
        return customerFavoriteItem;
    }

    public Gift getGift() {
        return gift;
    }

    public void takeGift(Gift gift) {
        this.gift = gift;
    }

    public void openGift() {
        if (gift != null) {
            gift.openGift();
        } else {
            System.out.println("No gift available.");
        }
    }

    public void addItemToFavorite(Item item) {
        if (!customerFavoriteItem.contains(item)) {
            customerFavoriteItem.add(item);
        }
    }

    public void removeItemFromFavorite(Item item) {
        customerFavoriteItem.remove(item);
    }




}
