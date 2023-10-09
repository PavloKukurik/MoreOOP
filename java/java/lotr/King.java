package java.lotr;

import java.util.Random;

import kick.KingStrategy;

public class King extends Character{

    private static final Random RANDOM = new Random();
    private Random random;

    public King() {super(5 + RANDOM.nextInt(11), 5 + RANDOM.nextInt(11), new KingStrategy());
    }



}
