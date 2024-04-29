package de.kvb.mammasoft.ccd.jm.strings;

import java.util.regex.Pattern;

//Using plain strings instead of regular expressions 166
public class Beispiel1 {
    public static void main(String[] args) {
        String javaPackage = "java.util.concurrent";
        String[] parts = javaPackage.split(".");

        //System.out.println(parts.length);
        //Stream.of(parts).forEach(System.out::println);

        //System.out.println(split(".", javaPackage).length);
    }

    static String[] split(String delimiter, String stringToSplit){
        return Pattern.compile(delimiter, Pattern.LITERAL)
                .split(stringToSplit);
    }
}
