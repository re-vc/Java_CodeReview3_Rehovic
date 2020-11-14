package citybike;

public class User {

    private int userID;
    private String name;
    private String surname;
    private Bike currentlyRentedBike;

    // constructor
    public User(int userID, String name, String surname, Bike currentlyRentedBike) {
        this.userID = userID;
        this.name = name;
        this.surname = surname;
        this.currentlyRentedBike = currentlyRentedBike;
    }

    public User(int userID, String name, String surname) {
        this.userID = userID;
        this.name = name;
        this.surname = surname;
    }

    // getter | setter
    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Bike getCurrentlyRentedBike() {
        return currentlyRentedBike;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCurrentlyRentedBike(Bike currentlyRentedBike) {
        this.currentlyRentedBike = currentlyRentedBike;
    }

    // methods
    public void rentBike(Station station, Bike bike) {
        if (station.getBikes().contains(bike)) {
            station.removeBike(bike);
            setCurrentlyRentedBike(bike);
            System.out.println(name + " rented bike ID: " + currentlyRentedBike.getBikeID() + " - " + currentlyRentedBike.getColor() + " from " + station.getLocation());
        } else {
            System.out.println(name + " tried renting bike ID: " + bike.getBikeID() + " - " + bike.getColor() + " but it's not there. ");
        }
    }

    public void returnBike(Station station, Bike bike) {
        if (station.getBikes().size() - 1 == 5) {
            System.out.println(name + " tried returning bike ID: " + bike.getBikeID() + " - " + bike.getColor() + " to " + station.getLocation() + " but it's already full.");
        } else {
            if (getCurrentlyRentedBike() == bike) {
                station.addBike(bike);
                setCurrentlyRentedBike(null);
                System.out.println(name + " returned bike ID: " + bike.getBikeID() + " - " + bike.getColor() + " to " + station.getLocation());
            } else {
                System.out.println(name + " tried returning this bike ID: " + bike.getBikeID() + " - " + bike.getColor() + " but he doesn't have it. ");
            }
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", currentlyRentedBike=" + currentlyRentedBike +
                '}';
    }
}
