package model;

import java.io.Serializable;

/**
 *
 * @author Jeremy
 */
public class Game implements Serializable {

    private Player thePlayer;
    private Map theMap;
    private Storehouse theStorehouse;
    private int currentPopulation;
    private int acresOwned;
    private int wheatInStorage;

    public Game() {
        // empty constructor for Javabeans
    }

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    public Map getTheMap() {
        return theMap;
    }

    public void setTheMap(Map theMap) {
        this.theMap = theMap;
    }

    public Storehouse getTheStorehouse() {
        return theStorehouse;
    }

    public void setTheStorehouse(Storehouse theStorehouse) {
        this.theStorehouse = theStorehouse;
    }

    public int getCurrentPopulation() {
        return currentPopulation;
    }

    public void setCurrentPopulation(int currentPopulation) {
        this.currentPopulation = currentPopulation;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public int getWheatInStorage() {
        return wheatInStorage;
    }

    public void setWheatInStorage(int wheatInStorage) {
        this.wheatInStorage = wheatInStorage;
    }

    @Override
    public String toString() {
        return "Game{"
            + "thePlayer=" + thePlayer
            + ", theMap=" + theMap
            + ", theStorehouse=" + theStorehouse
            + ", currentPopulation=" + currentPopulation
            + ", acresOwned=" + acresOwned
            + ", wheatInStorage=" + wheatInStorage
            + '}';
    }

}
