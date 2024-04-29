package de.kvb.mammasoft.ccd.jm.numbers;

public class Beispiel3 {//109
    public static void main(String[] args) {
        System.out.println(isUngerade(2));
        System.out.println(isUngerade(3));

        //System.out.println(isUngerade(-2));
        //System.out.println(isUngerade(-3));
    }

    public static boolean isUngerade(int value) {
        return value % 2 == 1;
    }

    //value % 2 != 0
}
