package oop;

import moreobjects.Color;

public class Car {

    public int horsePowers;

    public Color color;

    public Car() {
        this.horsePowers = 74;
        this.color = Color.BLACK;
    }

    public Car(int horsePowers, Color color) {
        this.horsePowers = horsePowers;
        this.color = color;
    }

    public void wroomWroom() {
        System.out.println("Wroom wroom with " + horsePowers + " hp " + "and color " + color);
    }

    public int getHorsePowers() {
        return horsePowers;
    }
}
