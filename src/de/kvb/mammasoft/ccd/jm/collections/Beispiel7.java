package de.kvb.mammasoft.ccd.jm.collections;

import java.util.ArrayList;
import java.util.List;

//Concurrent modification during the iteration 231
public class Beispiel7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        for (String s : list) {
            System.out.println(s);
            if (s.equals("b")) {
                list.add("x");
            }
        }
    }
}
