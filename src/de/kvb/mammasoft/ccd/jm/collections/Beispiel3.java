package de.kvb.mammasoft.ccd.jm.collections;

import java.util.HashMap;
//avoid null values in all maps
public class Beispiel3 {//Using null values in maps 222 - 223
    public static void main(String[] args) {
        var map = new HashMap<String, String>();
        map.put("x", null);

        assert map.containsKey("x");
        assert map.getOrDefault("x", "default") == null;
    }
}
