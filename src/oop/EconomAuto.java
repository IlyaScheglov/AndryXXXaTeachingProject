package oop;

public class EconomAuto extends Car {

    public EconomAuto(int horsepower) {
        super(horsepower);
    }

    public void breakChasto() {
        System.out.println("Хозяин, я опять сломалась");
    }
}
