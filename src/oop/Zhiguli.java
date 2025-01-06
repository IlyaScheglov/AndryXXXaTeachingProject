package oop;

public class Zhiguli extends EconomAuto {

    public Zhiguli() {
        super(80);
    }

    @Override
    public void breakChasto() {
        System.out.println("Сломальсь, но похуй, доедем");
    }
}
