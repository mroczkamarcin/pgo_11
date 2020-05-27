package com.task1;

import java.util.ArrayList;

public class Car implements java.lang.Comparable<Car> {

    String name;
    int yearOfProduction;

    public Car(String name, int yearOfProduction) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public int compareTo(Car car) {
        int compareage=((Car)car).getYearOfProduction();
        /* For Ascending order*/
        return this.yearOfProduction-compareage;
    }

    @Override
    public String toString() {
        return "Car name: "+name+" Production Year: "+yearOfProduction;
    }

}
