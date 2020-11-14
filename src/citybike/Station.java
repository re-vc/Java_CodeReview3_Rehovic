package citybike;

import java.util.ArrayList;

public class Station {

    private int stationID;
    private String location;

    private ArrayList<Bike> bikes = new ArrayList<>();

    // constructor
    public Station(int stationID, String location) {
        this.stationID = stationID;
        this.location = location;
    }

    // getter | setter
    public int getStationID() {
        return stationID;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Bike> getBikes() {
        return bikes;
    }

    public void setStationID(int stationID) {
        this.stationID = stationID;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBikes(ArrayList<Bike> bikes) {
        this.bikes = bikes;
    }

    // methods
        // adds an existing Bike to the ArrayList
    public void addBike(Bike bike){
       bikes.add(bike);
    }
    public void removeBike(Bike bike){
        bikes.remove(bike);
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationID=" + stationID +
                ", location='" + location + '\'' +
                ", bikes=" + bikes +
                '}';
    }
}
