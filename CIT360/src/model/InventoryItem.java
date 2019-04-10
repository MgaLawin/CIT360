package model;

import java.io.Serializable;

/**
 *
 * @author Jeremy
 */
import model.Condition;
import model.ItemType;

public class InventoryItem implements Serializable {

    private ItemType ItemType;
    private int quantity;
    private Condition condition;
    private String name;

    public InventoryItem() {
//        constructor
    }

    // do I need the item type because the inventory items are tools?
    public InventoryItem(String name, ItemType itemType, int quantity, Condition condition) {
        setname(name);
        setItemType(itemType);
        setquantity(quantity);
        setcondition(condition);
    }

    public void setItemType(ItemType itemType) {
        this.ItemType = itemType;
    }

    public ItemType getItemType() {
        return ItemType;
    }

    public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    public void setcondition(Condition condition) {
        this.condition = condition;
    }

    public Condition getcondition() {
        return condition;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "InventoryItem{"
                + "ItemType=" + ItemType + ","
                + " quantity=" + quantity + ","
                + " condition=" + condition + ", "
                + "name=" + name
                + '}';

    }

}
