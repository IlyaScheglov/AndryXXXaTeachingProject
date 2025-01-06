package oop;

public class Car {

    public int horsePowers;

    public Car() {
        this.horsePowers = 74;
    }

    public Car(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    public void wroomWroom() {
        System.out.println("Wroom wroom with " + horsePowers + " hp");
    }

    public int getHorsePowers() {
        return horsePowers;
    }
}
