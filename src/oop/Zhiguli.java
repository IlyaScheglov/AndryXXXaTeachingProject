package oop;

import moreobjects.Color;

public class Zhiguli extends EconomAuto {

    public Zhiguli() {
        super(80, Color.WHITE);
    }

    @Override
    public void breakChasto() {
        System.out.println("Сломальсь, но похуй, доедем");
    }
}
