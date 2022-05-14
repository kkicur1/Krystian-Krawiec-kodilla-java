package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    private List<Flight> availableFlights;

    public FlightService(List<Flight> availableFlights) {
        this.availableFlights = new ArrayList<>();
        availableFlights.add(new Flight("Warsaw", "London"));
        availableFlights.add(new Flight("Warsaw", "Frankfurt"));
        availableFlights.add(new Flight("Warsaw", "Malta"));
    }

    public List<Flight> findFlightsFrom(String departure) {
        return this.availableFlights.stream()
                .filter(flight -> flight.getFlightFrom().equals(departure))
                .collect(Collectors.toList());
    }


    public List<Flight> findFlightTo(String arrival) {
        return null;
    }

    public List<Flight> findFlightToWithPrzesiadka(String departure, String arrival) {
        return null;
    }

}
