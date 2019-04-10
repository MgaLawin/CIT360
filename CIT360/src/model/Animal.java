package model;

import java.io.Serializable;

/**
 *
 * @author Jeremy
 */
public class Animal extends InventoryItem {

    private String name;
    private int quantity;
    private String condition;
    private int age;

    public Animal(String name, int quantity, Condition condition, int age) {
        super(name, ItemType.ANIMAL, quantity, condition);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCondition() {
        return condition;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" + "age=" + age + '}';
    }

}
