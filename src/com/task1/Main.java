package com.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car("Volvo",2000);
        Car c2 = new Car("Mercedes",2017);
        Car c3 = new Car("Audi",2020);
        Car c4 = new Car("Mercedes",2017);
        Car c5 = new Car("Abarth",2013);
        Car c6 = new Car("Opel",2003);
        Car c7 = new Car("VW",2019);
        Car c8 = new Car("Nissan",1975);
        Car c9 = new Car("Ford",1999);
        Car c10 = new Car("Fiat",2008);

        ArrayList cars = new ArrayList();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        cars.add(c8);
        cars.add(c9);
        cars.add(c10);

        Collections.sort(cars);

        for (Object car : cars) {
            System.out.println(car);

        }
    }
}
