import java.time.LocalDate;
import java.util.ArrayList;

public class RegularOrder extends Order {
    public RegularOrder(String orderName, Address delivaryAddress, ArrayList<Item> itemsList, Customer customer, PaymentType paymentType, LocalDate orderDate) {
        super(orderName, delivaryAddress, itemsList, customer, paymentType, orderDate);
    }

    @Override
    public void calculateTotalPrice() {
        double total = 0;
        for (Item item : getItemsList()) {
            total += item.getItemPrice();
        }
        setTotalOrderPrice(total);
    }
}
