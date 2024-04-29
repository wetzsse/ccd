package de.kvb.mammasoft.ccd.jm.common;

import java.net.URL;
import java.net.URLClassLoader;

public class Beispiel1 {


    public static void main(String[] args) throws Exception {
        URL url = Beispiel1.class.getResource(".");
        System.out.println(url);
        ClassLoader parent = System.class.getClassLoader();
        try (URLClassLoader newLoader =
                     new URLClassLoader(new URL[]{url}, parent)) {
            Class<?> anotherMyClass = newLoader.loadClass("de.kvb.mammasoft.ccd.jm.common.Beispiel2");
            Object o = anotherMyClass.getConstructor().newInstance();
            System.out.println("Class: " + o.getClass());
            System.out.println("Loader: " + o.getClass().getClassLoader());
            System.out.println("Instance of: " + (o instanceof Beispiel1));
            Beispiel1 cls = (Beispiel1) o;
        }
    }


}
