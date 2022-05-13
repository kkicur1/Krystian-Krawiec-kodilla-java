package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

public final class MovieStore {

    public Map<String, List<String>> getMovies() {
        final List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        final List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        final List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        final Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return new HashMap<>(booksTitlesWithTranslations);
    }
}

class StreamMain {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String result = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(result);
    }
}