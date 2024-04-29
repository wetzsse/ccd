package de.kvb.mammasoft.ccd.jm.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

//producing a side effect from the function passed into an intermediate operation is not recommended
public class Beispiel1 {

    public static void main(String[] args) {

        List<String> containNoNeedle = new ArrayList<>();
        List<String> containNeedle = List.of("a", "b", "c", "d", "e", "a", "b", "a", "a", "b").stream()
                .filter(str -> {
                    if (str.contains("a")) {
                        return true;
                    }
                    containNoNeedle.add(str);
                    return false;
                }).collect(toList());

        System.out.println(containNoNeedle);
        System.out.println(containNeedle);

        //option1();

        List<String> trimmed = new ArrayList<>();
        long count = List.of(" a ", " b ", " c ").stream()
                .map(String::trim)
                .peek(trimmed::add)//produces a side effect, as its functional parameter returns void
                .count();
        //System.out.println(trimmed);
    }


    static void option1() {
        Map<Boolean, List<String>> partitions = List.of("a", "b", "c", "d", "e", "a", "b", "a", "a", "b")
                .stream()
                .collect(Collectors.partitioningBy(str -> str.contains("a")));

        System.out.println(partitions.get(false));
        System.out.println(partitions.get(true));
    }
}
