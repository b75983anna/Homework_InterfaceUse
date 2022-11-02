package com.accenture.OOP;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Country canada = new Country("Canada", 9984670.0 );
        Country china = new Country("China", 9596961.0);
        Country monaco = new Country("Monako", 2.02);
        Country gibraltar = new Country("Gibraltar", 6.0);

        Country[] countries = {canada, china, monaco, gibraltar};

        Country largestCountry = (Country) maximum(countries);
        System.out.println("The country with the largest area is: " + largestCountry.toString());

    }

    public static Measurable maximum(Measurable[] objects) {
        Measurable largestCountry = new Country();
        double maxArea = 0;

        for (Measurable object : objects) {

            if (object.getMeasure() > maxArea) {
                maxArea = object.getMeasure();
                largestCountry = object;
            }
        }

        return largestCountry;
    }

    }
