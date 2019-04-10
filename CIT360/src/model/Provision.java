package model;

import java.io.Serializable;

/**
 *
 * @author Jeremy
 */
public class Provision extends InventoryItem implements Serializable {

    private boolean perishable;

    public Provision(String name, int quantity, Condition condition, boolean perishable) {
        super(name, ItemType.PROVISION, quantity, condition);
        setPerishable(perishable);
    }

    public boolean getperishable() {
        return perishable;
    }

    public void setPerishable(boolean perishable) {
        this.perishable = perishable;
    }

    @Override
    public String toString() {
        return "Provision{" + "perishable=" + perishable + '}';
    }

}
