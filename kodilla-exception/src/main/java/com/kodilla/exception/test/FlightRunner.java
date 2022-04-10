package com.kodilla.exception.test;

public class FlightRunner {
    public static void main (String[] args){
        FindFlight resultFlight = new FindFlight();
        Flight flight=new Flight("Kraków", "Wroław");

        try {
            resultFlight.findFlight(flight);
        }catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
