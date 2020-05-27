package com.task3;

import com.task2.Item;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Item i6 = new Item(6,"item6");
        Item i7 = new Item(7,"item7");
        Item i8 = new Item(8,"item8");
        Item i9 = new Item(9,"item9");
        Item i10 = new Item(10,"item10");
        Item i11 = new Item(11,"item11");
        Item i12= new Item(12,"item12");
        Item i13 = new Item(13,"item13");
        Item i14 = new Item(14,"item14");
        Item i15 = new Item(15,"item15");


        ArrayList<Item>container = new ArrayList<>();
        container.add(i6);
        container.add(i7);
        container.add(i8);
        container.add(i9);
        container.add(i10);
        container.add(i11);
        container.add(i12);
        container.add(i13);
        container.add(i14);
        container.add(i15);



        HashMap<Integer, String> container2 = new HashMap();

        for (Item i: container.subList(0,5)) {
            container2.put(i.getId(), i.getName());
        }

        System.out.println("The set is: "+container2.entrySet());

    }
}
