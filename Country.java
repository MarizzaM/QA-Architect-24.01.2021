package com.company;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Country {
    public String name;
    public String continent;
    public double size;
    public int numberOfCitizens;

//    public Country(String name, String continent, double size, int numberOfCitizens) {
//        this.name = name;
//        this.continent = continent;
//        this.size = size;
//        this.numberOfCitizens = numberOfCitizens;
//    }

    public void printCountrySize(){
        System.out.println(String.format("%s covers an area of %.2f square kilometres", name, size ));
    }

    public void printSizePerCitizen(){
        System.out.println(String.format("Size per citizen: %.2f square metres", size/numberOfCitizens*1000 ));
    }

//    @Override
//    public String toString() {
//        return "Country{" +
//                "name='" + name + '\'' +
//                ", continent='" + continent + '\'' +
//                ", size=" + size +
//                ", numberOfCitizens=" + numberOfCitizens +
//                '}';
//    }
}
