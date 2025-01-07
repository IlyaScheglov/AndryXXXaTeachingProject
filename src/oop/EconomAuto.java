package oop;

import moreobjects.Color;

public class EconomAuto extends Car {

    public EconomAuto(int horsepower, Color color) {
        super(horsepower, color);
    }

    public void breakChasto() {
        System.out.println("Хозяин, я опять сломалась");
    }
}
