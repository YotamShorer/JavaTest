import java.time.LocalDate;
import java.util.ArrayList;

public class VIPOrder extends Order {

    public VIPOrder(String orderName, Address delivaryAddress, ArrayList<Item> itemsList, Customer customer, PaymentType paymentType, LocalDate orderDate) {
        super(orderName, delivaryAddress, itemsList, customer, paymentType, orderDate);
    }

    @Override
    public void calculateTotalPrice() {
        if (getCustomer().getCustomerType() != Customer.CustomerType.VIP) {
            throw new IllegalArgumentException("Customer must be VIP to place a VIP order.");
        }
        double total = 0;
        for (Item item : getItemsList()) {
            total += item.getItemPrice();
        }
        Double discount = getCustomer().getCustomerDiscount();
        if (discount != null){
            setTotalOrderPrice(total * (1 - discount / 100));
        } else {
            setTotalOrderPrice(null);
        }
        }
    }

