package model;

import java.io.Serializable;

/**
 *
 * @author Jeremy
 */
public class Player implements Serializable {

    private String name;

    public Player() {
        // empty constructor for Javabeans
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{"
            + "name" + name
            + "}";
    }

}
