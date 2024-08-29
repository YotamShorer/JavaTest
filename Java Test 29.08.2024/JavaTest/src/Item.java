import java.util.ArrayList;

public class Item {
    private int itemId;
    private String itemName;
    private double itemPrice;

    public Item(int itemId, String itemName, double itemPrice) {
            this.itemId = itemId;
            this.itemName = itemName;
            this.itemPrice = itemPrice;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }
    public double getItemPrice() {
        return itemPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName=" + itemName +
                ", itemPrice=" + itemPrice +
                "}";
    }
}
