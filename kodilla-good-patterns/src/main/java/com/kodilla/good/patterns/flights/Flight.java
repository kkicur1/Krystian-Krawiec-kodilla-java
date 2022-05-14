package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ArrivalAirport {

    String arrivalAirport;

    public ArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrivalAirport)) return false;

        ArrivalAirport that = (ArrivalAirport) o;

        return arrivalAirport.equals(that.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return arrivalAirport.hashCode();
    }

    @Override
    public String toString() {
        return "ArrivalAirport{" +
                "arrivalAirport='" + arrivalAirport + '\'' +
                '}';
    }
}

final class DepartureAirport {

    private final List<String> departureAirports=new ArrayList<>();

    public DepartureAirport() {

        departureAirports.add("Krakow");
        departureAirports.add("Katowice");
        departureAirports.add("Warszawa");
        departureAirports.add("Gdansk");
        departureAirports.add("Wroclaw");
        departureAirports.add("Poznan");
    }

    public List<String> getDepartureAirports() {
        return new ArrayList<>(departureAirports);
    }
}

final class Connections {

    private final Map<ArrivalAirport, DepartureAirport> connections= new HashMap<>();

    public Connections () {
        connections.put(new ArrivalAirport("Krakow"), new DepartureAirport());
        connections.put(new ArrivalAirport("Katowice"), new DepartureAirport());
        connections.put(new ArrivalAirport("Warszawa"), new DepartureAirport());
    }

    public Map<ArrivalAirport,DepartureAirport> getConnections() {
        return new HashMap<>(connections);
    }
}

class Flight {

    private String flightFrom;
    private String flightTo;

    public Flight(String flightFrom, String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }
}


class FlightProcess {

    public static void main (String[] args) {

    }
}
