package de.kvb.mammasoft.ccd.jm.structure;

import java.util.Random;

public class Beispiel1 {//82

    public static void main(String[] args) {
        RandomIdEntity randomIdEntity = new RandomIdEntity();
    }

    static class Entity {
        final int id;
        Entity() {
            id = generateId();
        }
        protected int generateId() {
            return 0;
        }
    }

    static class RandomIdEntity extends Entity {
        final Random random = new Random();
        @Override
        protected int generateId() {
            return random.nextInt();
        }
    }
}
