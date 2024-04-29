package de.kvb.mammasoft.ccd.jm.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Avoid returning both modifiable and unmodifiable
//collections on different code paths of your method 225

//Assume every collection passed to your method as a parameter is unmodifiable
//unless your method explicitly requires modifiable collection as the input
public class Beispiel4 {

    public static void main(String[] args) {
        List<String> strings = sanitize(new String[]{});
        strings.add("Custom...");
    }

    static List<String> sanitize(String[] input) {
        if (input.length == 0) {
            return Collections.emptyList();
        }
        List<String> list = new ArrayList<>();
        for (String s : input) {
            s = s.trim();
            if (!s.isEmpty()) list.add(s);
        }
        return list;
    }

}
