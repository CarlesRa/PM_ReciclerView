package com.carlesramos.recicleview.model;

public class Country {
    private String countryCode;
    private String countryName;
    private long population;
    private String capital;
    private String countryIso3;
    private int imageUrl;

    public Country(String countryCode, String countryName, long population, String capital, String countryIso3, int imageUrl) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.population = population;
        this.capital = capital;
        this.countryIso3 = countryIso3;
        this.imageUrl = imageUrl;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public long getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }

    public String getCountryIso3() {
        return countryIso3;
    }

    public int getImageUrl() {
        return imageUrl;
    }
}
