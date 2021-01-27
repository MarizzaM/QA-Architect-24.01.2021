package com.company;

public class Main {

    public static void main(String[] args) {

    Country belarus = new Country("Belarus", " Europe", 207600, 9400000);

        System.out.println(belarus);
        belarus.printCountrySize();
        belarus.printSizePerCitizen();

    }

}
