package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {

    private final String continentName;
    private final Set<Country> countries= new HashSet<>();

    public Continent(final String continentName) {

        this.continentName = continentName;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public void addCountry(Country country) {

        countries.add(country);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countries=" + countries +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;

        Continent continent = (Continent) o;

        return continentName != null ? continentName.equals(continent.continentName) : continent.continentName == null;
    }

    @Override
    public int hashCode() {
        return continentName != null ? continentName.hashCode() : 0;
    }
}
