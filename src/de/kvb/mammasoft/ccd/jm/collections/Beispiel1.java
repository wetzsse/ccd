package de.kvb.mammasoft.ccd.jm.collections;

import java.io.File;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

//Searching the object of unrelated type 214
public class Beispiel1 {

    public static void main(String[] args) {

        Path filePath = Path.of("...");
        System.out.println(isAllowed(filePath));
    }

    static Set<File> allowedFiles = new HashSet<>();

    static boolean isAllowed(Path filePath) {
        return allowedFiles.contains(filePath);
    }
}
