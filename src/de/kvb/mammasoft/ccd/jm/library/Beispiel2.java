package de.kvb.mammasoft.ccd.jm.library;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Consuming the stream twice
public class Beispiel2 {

    public static void main(String[] args) {
        process(List.of(" haeader ", " a ", " b", "c "), false);
    }

    static void process(List<String> strings, boolean skipHeader) {
        Stream<String> stream = strings.stream();
        if (skipHeader) {
            stream.skip(1);//stream =
        }
        List<String> trimmed = stream.map(String::trim).collect(Collectors.toList());
        // Use trimmed
    }

}
