package de.kvb.mammasoft.ccd.jm.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//Mixing up single object and collection 216
public class Beispiel2 {

    public static void main(String[] args) {
        int number1 = Integer.parseInt("1");
        //List<Object> list = new ArrayList<>();
        //list.add(number1);
        processNumbersOnly(number1);
    }

    static void processNumbersOnly(Object...objects) {
        Stream.of(objects)
                .filter(e -> e instanceof Number)
                .forEach(num -> processNumber((Number) num));
    }

    static private void processNumber(Number num) {
        System.out.println(num);
    }
}
