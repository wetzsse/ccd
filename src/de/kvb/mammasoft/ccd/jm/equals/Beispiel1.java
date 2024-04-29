package de.kvb.mammasoft.ccd.jm.equals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

public class Beispiel1 {//184

    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        List<URL> urlList = List.of(new URL("https://example.com"));
        URL urlToFind = new URL("https://example.com");
        urlToFind.equals(new URL("https://example.com"));
        if (urlList.contains(urlToFind)) {
            System.out.println("Found");
        }


        //URI uri = new URI("https://example.com");
        //System.out.println(uri.equals(new URI("https://EXAMPLE.COM")));
    }

}
