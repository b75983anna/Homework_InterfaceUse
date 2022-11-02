package com.accenture.OOP;

public class Country implements Measurable {
    private String name;
    private double area;

    public Country() {
    }

    public Country(String name, double area) {
        this.name = name;
        this.area = (area < 0)?0:area;
    }

    @Override
    public String toString() {
        return "Country: " +
                "name = " + name +
                ", area = " + area;
    }

    @Override
    public double getMeasure() {
        return this.area;
    }


}
