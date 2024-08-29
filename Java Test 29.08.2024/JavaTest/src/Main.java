import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Item laptop = new Item(1, "Laptop", 7500);
        System.out.println("Item ID: " + laptop.getItemId() + ", item name: " + laptop.getItemName() + ", item price: " + laptop.getItemPrice());
        Item chair = new Item(2, "Chair", 1249.90);
        System.out.println("Item ID: " + chair.getItemId() + ", item name: " + chair.getItemName() + ", item price: " + chair.getItemPrice());
        Item desk = new Item(3, "Desk", 675);
        System.out.println("Item ID: " + desk.getItemId() + ", item name: " + desk.getItemName() + ", item price: " + desk.getItemPrice());
        Item mouse = new Item(4, "Mouse", 200);
        System.out.println("Item ID: " + mouse.getItemId() + ", item name: " + mouse.getItemName() + ", item price: " + mouse.getItemPrice());

        ArrayList<Item> itemsList1 = new ArrayList<>();
        itemsList1.add(laptop);
        itemsList1.add(chair);
        itemsList1.add(desk);
        itemsList1.add(mouse);

        Address address1 = new Address("Israel","Tel Aviv","Bograshov", 15);

        Customer john = new Customer("123456789", "John", "Doe", "john123@java.com",
                address1, Customer.CustomerType.Regular, null);

        RegularOrder order1 = new RegularOrder("Order1", address1, itemsList1, john, Order.PaymentType.CreditCard, LocalDate.now());

        System.out.println("");
        System.out.println(order1);
        System.out.println("");
        Gift giftCard1 = new GiftCard();
        john.takeGift(giftCard1);
        System.out.println("John took the gift card.");
        System.out.println("John opened the gift!");
        john.openGift();
        System.out.println("");

        ArrayList<Item> itemsList2 = new ArrayList<>();
        itemsList2.add(laptop);
        itemsList2.add(desk);

        Address address2 = new Address("Israel","Jerusalem","Ben Yehuda", 57);

        Customer moshe = new Customer("1223345", "Moshe", "Levi", "moshelevi@java.com",
                address2, Customer.CustomerType.VIP, 20.00);

        VIPOrder order2 = new VIPOrder("Order2", address2, itemsList2, moshe, Order.PaymentType.Cash, LocalDate.now());

        System.out.println(order2);


    }
}
