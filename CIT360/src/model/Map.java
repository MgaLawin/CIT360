package model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Jeremy
 */
public class Map implements Serializable {

    private Location[][] locations = new Location[5][5];
    private Point currentLocation;

    public Map() {
        // empty constructor for Javabeans
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Location[][] getLocation() {
        return locations;
    }

    public Point getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Point point) {
        this.currentLocation = currentLocation;
    }

    @Override
    public String toString() {
        return "Map {"
                + "locations" + Arrays.toString(locations)
                + ", currentLocation" + currentLocation
                + "}";
    }

}
