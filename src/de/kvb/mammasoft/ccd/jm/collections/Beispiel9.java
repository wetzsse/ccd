package de.kvb.mammasoft.ccd.jm.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Jumping over the next element after List.remove() 235
public class Beispiel9 {
    public static void main(String[] args) {

        ArrayList<Integer> history = IntStream.range(0, 10).boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(history);

        trimHistory(history, 5);

        //System.out.println(history);
    }

    static void trimHistory(List<?> history, int maxElements) {
        for (int i = maxElements; i < history.size(); i++) {
            history.remove(i);
        }
    }

    static void clean(List<Integer> data, Predicate<Integer> condition){
        for (int i = 0; i < data.size(); i++) {
            if (condition.test(data.get(i))) {
                data.remove(i);
            }
        }
    }


}
