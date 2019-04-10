package view;

import cityofaaron.CityOfAaron;
import control.MapControl;
import model.Location;
import model.Map;

/**
 *
 * @author Jeremy
 */
public class ViewTheMapView extends ViewBase {

    protected String message;

    /**
     * Constructor
     *
     * The view the map displays the map and immediately returns to the game
     * menu. It will have be a 2 dimensional array of locations It will be at
     * least 5 x 5 Each location will have a symbol, a name and what can be
     * seen. After the map is displayed the program will return to the Game
     * Menu.
     *
     */
    @Override
    protected String getMessage() {
        return null;

    }

    /**
     * There are no inputs from the user return null
     *
     * @return
     */
    @Override
    protected String[] getInputs() {
        return null;
    }

    @Override
    public boolean doAction(String[] inputs) {

        Map map = MapControl.createMap();

        // public void displayMap() {
        // print out the map
        Location[][] locations = CityOfAaron.getCurrentGame().getTheMap().getLocation();
        this.console.println();

        for (int row = 0; row < locations.length; row++) {
            for (int column = 0; column < locations[row].length; column++) {
                this.console.print(locations[row][column].getMapSymbol() + " ");
            }
            this.console.println();

        }
        this.console.println("------------------------------");
        this.console.println("A - City of Aaron");
        this.console.println("B- Border");
        this.console.println("C - Ruler's Court");
        this.console.println("D - Village of Deon");
        this.console.println("F - Wheat field");
        this.console.println("J - Village of Jeremy");
        this.console.println("R - River");
        this.console.println("S - Storehouse");
        this.console.println("T - Temple");
        this.console.println("U - Undeveloped land");
        this.console.println("W - Watchtower");
        this.console.println("Y - Village of Chelsea");
        this.console.println("------------------------------");
        pause(1500);
        return false;
    }
}
