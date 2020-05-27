package com.task2;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Item i1 = new Item(1,"item1");
        Item i2 = new Item(2,"item2");
        Item i3 = new Item(3,"item3");
        Item i4 = new Item(4,"item4");
        Item i5 = new Item(5,"item5");


        ArrayList<Item>container = new ArrayList<>();
        container.add(i1);
        container.add(i2);
        container.add(i3);
        container.add(i4);
        container.add(i5);

        container.get(0).show();
        container.get(1).show();
        container.get(2).show();
        container.get(3).show();
        container.get(4).show();

        HashMap<Integer, String> container2 = new HashMap();

        for (Item i: container) {
            container2.put(i.getId(), i.getName());
        }

        System.out.println("The set is: "+container2.entrySet());

    }
}
