package de.kvb.mammasoft.ccd.jm.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Mixing List.remove() overloads 234
public class Beispiel8 {

    public static void main(String[] args) {
        List<Integer> offsets = getOffsets();
        Collections.reverse(offsets);
        //System.out.println(offsets);
        offsets.remove(0);
        offsets.remove((Integer) 0);
        //System.out.println(offsets);
    }

    private static List<Integer> getOffsets() {
        return IntStream.range(0, 10).boxed()
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
