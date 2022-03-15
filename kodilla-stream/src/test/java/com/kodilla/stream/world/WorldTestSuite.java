package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        Country uganda = new Country("Uganda", BigDecimal.valueOf(100));
        Country kongo = new Country("Kongo", BigDecimal.valueOf(150));
        Continent africa = new Continent("Afryka");
        africa.addCountry(uganda);
        africa.addCountry(kongo);

        Country poland = new Country("Poland", new BigDecimal(200));
        Country germany = new Country("Germany", new BigDecimal(250));
        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);

        World world = new World();
        world.addContinent(africa);
        world.addContinent(europe);

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        assertEquals(BigDecimal.valueOf(700), peopleQuantity);
    }
}
