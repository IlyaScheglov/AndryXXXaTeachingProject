package oop;

import moreobjects.Color;

public class Priora extends EconomAuto {

    public Priora() {
        super(120, Color.BLACK);
    }

    public Priora(int horsePowers, Color color) {
        super(horsePowers, color);
    }

    public void shashki() {
        System.out.println("шашки мане");
    }

    public static class PrioraEngine {
        private int levPowers;

        public PrioraEngine(int levPowers) {
            this.levPowers = levPowers;
        }

        public int getLevPowers() {
            return levPowers;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Priora) {
            Priora p = (Priora) obj;
            return p.getHorsePowers() == this.horsePowers;
        }
        return false;
    }
}
