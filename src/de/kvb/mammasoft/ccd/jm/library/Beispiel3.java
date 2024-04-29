package de.kvb.mammasoft.ccd.jm.library;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Using null values in a stream where it’s not allowed
public class Beispiel3 {

    public static void main(String[] args) {
        var list = Arrays.asList(null, 1, 2);
        var comparator =
                Comparator.<Integer>nullsLast(Comparator.naturalOrder());

        System.out.println(list.stream()
                .collect(Collectors.maxBy(comparator)));

        //System.out.println(list.stream().max(comparator));
        //test2();
    }

    static void test2() {
        Map<Long, String> map = List.of(new Tupel(1L, null), new Tupel(2L, "x"))
                .stream()
                .collect(Collectors.toMap(Tupel::id, Tupel::value));
    }

    static record Tupel(Long id, String value) {

    }
}
