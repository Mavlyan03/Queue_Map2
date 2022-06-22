package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<City>city = new HashSet<>();
        city.add(new City(11,"New-York",9380000));
        city.add(new City(70,"Los-Angeles",3973000));
        city.add(new City(33,"Chicago",2699090));
        city.add(new City(66,"Washington",701000));

        Set<City> treeSet = new TreeSet<>(city);
        Set<City> treeSetTak = new TreeSet<>(city);

        for (City city1 : treeSet) {
            if (city1.getCode() % 2 != 0) {
                treeSet.add(city1);
                System.out.println(city1);
            }
        }
        System.out.println("----------------------------------------");
        for (City city2 : treeSetTak) {
            if (city2.getCode() % 2 != 1) {
                treeSetTak.add(city2);
                System.out.println(city2);
            }
        }






    }
}
