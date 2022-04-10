package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportList = new HashMap<>();
        airportList.put("Kraków", true);
        airportList.put("Katowice", true);
        airportList.put("Rzeszów", false);
        airportList.put("Warszawa", true);
        airportList.put("Wrocław", false);

        Boolean result = airportList.get(flight.getArrivalAirport());

        if (result == null) {
            throw new RouteNotFoundException("Destynacja nie istnieje, wybierz inną");
        }   if(result == false) {
                System.out.println("Lotnisko zamknięte");
            }   else {
                    System.out.println("Lecimy!");
                }
        return result;
    }

}




