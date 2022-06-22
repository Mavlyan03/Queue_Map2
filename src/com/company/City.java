package com.company;

import java.util.Comparator;

public class City implements Comparable<City> {
    private int code;
    private String name;
    private int population;

    public City(int code, String name, int population) {
        this.code = code;
        this.name = name;
        this.population = population;
    }

    public int getCode() {return code;}

    public void setCode(int code) {this.code = code;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getPopulation() {return population;}

    public void setPopulation(int population) {this.population = population;}

    @Override
    public String toString() {
        return "code=" + code + ", name='" + name + ", population=" + population;
    }


    @Override
    public int compareTo(City o) {
        if (this.code == o.getCode()) {
            return 0;
        } else if (this.code > o.getCode()) {
            return -1;
        } else
            return 1;
    }
}

