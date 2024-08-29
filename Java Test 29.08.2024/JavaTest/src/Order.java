import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Order {
    public enum PaymentType {CreditCard, Check, Cash, Other}
    private static int orderIdCounter = 0;
    private int orderId;
    private String orderName;
    private Address delivaryAddress;
    private ArrayList<Item> itemsList;
    private Customer customer;
    private PaymentType paymentType;
    private LocalDate orderDate;
    private double totalOrderPrice;

    public Order(String orderName, Address delivaryAddress, ArrayList<Item> itemsList, Customer customer, PaymentType paymentType, LocalDate orderDate) {
        this.orderId = ++orderIdCounter;
        this.orderName = orderName;
        this.delivaryAddress = delivaryAddress;
        this.itemsList = itemsList;
        this.customer = customer;
        this.paymentType = paymentType;
        this.orderDate = orderDate;
        calculateTotalPrice();
        addItemsToCustomerFavorite();
    }

    public void addItemsToCustomerFavorite() {
        for (Item item : itemsList) {
            customer.addItemToFavorite(item);
        }
    }

    public abstract void calculateTotalPrice();

    public int getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public Address getDelivaryAddress() {
        return delivaryAddress;
    }

    public ArrayList<Item> getItemsList() {
        return itemsList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getTotalOrderPrice() {
        return totalOrderPrice;
    }

    public void setTotalOrderPrice(Double totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName=" + orderName +
                ", delivaryAddress=" + delivaryAddress +
                ", itemsList=" + itemsList +
                ", customer=" + customer.getCustomerFirstName() + " " + customer.getCustomerLastName() +
                ", paymentType=" + paymentType +
                ", orderDate=" + orderDate +
                ", totalOrderPrice=" + totalOrderPrice +
                "}";
    }
}
