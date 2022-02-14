package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public Double averageTemperature() {
        //to jest suma, tak sie powinna tez nazywac
        Double sum = 0.0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sum = sum + temperature.getValue();
        }

        //podziel sume przez ilosc par w mapie
        return sum / temperatures.getTemperatures().size();
    }

    public Double mediumTemperature() {


        List<Double> temperatureList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            temperatureList.add(temperature.getValue());
        }

        Collections.sort(temperatureList);

        System.out.println(temperatureList);
        if (temperatureList.size() % 2 != 0) {
            return temperatureList.get((temperatureList.size()/ 2));
        } else {
            return (temperatureList.get(temperatureList.size() / 2) + temperatureList.get((temperatureList.size() / 2) + 1)) / 2;
        }
    }
}

