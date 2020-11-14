package citybike;

public class Bike {

    private int bikeID;
    private String color;

    private static int nextBikeID = 1;

    // constructor
    public Bike(String color) {
        this.bikeID = nextBikeID;
        this.color = color;
        nextBikeID++;
    }

    public Bike() {
    }

    // getter | setter
    public int getBikeID() {
        return bikeID;
    }

    public String getColor() {
        return color;
    }

    public void setBikeID(int bikeID) {
        this.bikeID = bikeID;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeID=" + bikeID +
                ", color='" + color + '\'' +
                '}';
    }
}
