package de.kvb.mammasoft.ccd.jm.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Using mutable objects as keys 227
public class Beispiel5 {

    public static void main(String[] args) {
        Set<List<String>> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        set.add(list);
        list.add("Value");


        System.out.println(set.contains(list));
    }
}
//Avoid using mutable objects as map keys or set elements
