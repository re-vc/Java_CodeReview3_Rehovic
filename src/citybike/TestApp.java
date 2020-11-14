package citybike;

import com.sun.org.apache.bcel.internal.generic.FADD;

import java.util.ArrayList;
import java.util.HashMap;

public class TestApp {
    public static void main(String[] args) {

        // objects
            // Bike Objects
        Bike bikeOne = new Bike("Red");
        Bike bikeTwo = new Bike("Orange");
        Bike bikeThree = new Bike("Yellow");
        Bike bikeFour = new Bike("Green");
        Bike bikeFive = new Bike("Turquoise");
        Bike bikeSix = new Bike("Blue");
        Bike bikeSeven = new Bike("Purple");
        Bike bikeEight = new Bike("Violet");

            // Station Objects
        Station Karlsplatz = new Station(1,"Karlsplatz");
        Station Schwedenplatz = new Station(2,"Schwedenplatz");
        Station Favoriten = new Station(3,"Favoriten");

            // User Objects
        User userZ = new User(1,"Zack","Kiwi");
        User userY = new User(1,"Ymir","Melon");
        User userX = new User(1,"Xavier","Lime");
        User userW = new User(1,"Will","Apple");

        // hashmap
            // Bike Hashmap
        HashMap< Integer, String> mapBike = new HashMap<>();

        mapBike.put(bikeOne.getBikeID(),bikeOne.getColor());
        mapBike.put(bikeTwo.getBikeID(),bikeTwo.getColor());
        mapBike.put(bikeThree.getBikeID(),bikeThree.getColor());
        mapBike.put(bikeFour.getBikeID(),bikeFour.getColor());
        mapBike.put(bikeFive.getBikeID(),bikeFive.getColor());
        mapBike.put(bikeSix.getBikeID(),bikeSix.getColor());
        mapBike.put(bikeSeven.getBikeID(),bikeSeven.getColor());
        mapBike.put(bikeEight.getBikeID(),bikeEight.getColor());

            // Station Hashmap
        HashMap< Integer, Station > mapStation = new HashMap<>();

        mapStation.put(1,Karlsplatz);
        mapStation.put(2,Schwedenplatz);
        mapStation.put(3,Favoriten);

        System.out.println(mapBike);
        System.out.println(mapStation);

        System.out.println("**********"); // output readability

        // calling method addBike to add a bike Object to the Arraylist of a Station Object.
        Karlsplatz.addBike(bikeEight);
        Karlsplatz.addBike(bikeSeven);
        Karlsplatz.addBike(bikeSix);


        Schwedenplatz.addBike(bikeOne);
        Schwedenplatz.addBike(bikeTwo);
        Schwedenplatz.addBike(bikeThree);
        Schwedenplatz.addBike(bikeFour);
        Schwedenplatz.addBike(bikeFive);

        System.out.println(Karlsplatz.getLocation() + " " + Karlsplatz.getBikes());
        System.out.println(Schwedenplatz.getLocation() + " " + Schwedenplatz.getBikes());

        System.out.println("**********"); // output readability

        userZ.rentBike(Karlsplatz, bikeEight);
        userY.rentBike(Karlsplatz, bikeOne);
        userX.rentBike(Karlsplatz, bikeSix);

        System.out.println("**********"); // output readability

        userZ.returnBike(Schwedenplatz, bikeEight);
        //System.out.println(userZ.getCurrentlyRentedBike());

        System.out.println("**********"); // output readability

        userX.returnBike(Schwedenplatz, bikeSix);
        userX.returnBike(Favoriten, bikeSix);

        System.out.println("**********"); // output readability

        System.out.println(mapStation);
    }
}
