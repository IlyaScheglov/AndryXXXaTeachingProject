import moreobjects.*;
import objects.TestObject;
import objects.TestObjectExtender;
import oop.Car;
import oop.Priora;
import oop.Zhiguli;

import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Zhiguli zhiguli = new Zhiguli();
        Priora priora = new Priora();
        Priora priora2 = new Priora();
        System.out.println("Zhiga");
        test(zhiguli);
        System.out.println("Priora");
        test(priora);
        cicli();
        var mas = new int[] {116, 34, 12, 16, 75};
        sortirovka(mas);
        System.out.println(Arrays.toString(mas));
        generatePriora(10).wroomWroom();
        System.out.println(generateStringByInt(0));
        recursion(0);

        AbstractTestClass someClass = new AbstractExtender("login", "password");
        someClass.doSmth();

        Priora.PrioraEngine prioraEngine = new Priora.PrioraEngine(1000);
        System.out.println("Lev power of my priora=" + prioraEngine.getLevPowers());

        Pinguin pinguin = new Pinguin();
        System.out.println(pinguin.whoAmI());
        pinguin.suckMilk();

        System.out.println(pinguin.toString());

        System.out.println(priora.equals(priora2));
        priora.hashCode();
        Class clazz = priora2.getClass();
        System.out.println("Priora class name = " + clazz.getName());
        Integer intad = null;
        Optional<Priora> optionalPriora = Optional.ofNullable(null);
        Priora prioraFromOptional = optionalPriora
                .orElseGet(Priora::new);
    }

    private static void test(Car car) {
        car.wroomWroom();
    }

    private static void cicli() {
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                break;
            }
            System.out.println("For: " + i);
        }
        int b = 0;
        do {
            System.out.println(b);
            b++;
        } while (b != 3);
    }

    private static void sortirovka(int[] mas) {
        if(mas.length < 2) {
            return;
        }
        boolean gotovo = false;
        int y;
        while (!gotovo) {
            gotovo = true;
            for (int i = 0; i < mas.length-1; i++) {
                if (mas[i] > mas[i+1]) {
                    gotovo = false;

                    y = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = y;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }

    private static Priora generatePriora(int horsePower) {
        return new Priora(horsePower, Color.RED);
    }

    private static String generateStringByInt(int someInteger) {
//        if (someInteger == 0) {
//            return "ZERO";
//        } else if(someInteger == 1) {
//            return "ONE";
//        }
//        System.out.println("piska");
//        return "standard";

//        switch (someInteger) {
//            case 0:
//                return "ZERO";
//            case 1:
//                return "ONE";
//            default:
//                return "standard";
//        }

        return someInteger == 0 ? "ZERO" : someInteger == 1 ? "ONE" : "standard";
    }

    private static void recursion(int n) {
        if(n == 100) {
            return;
        }
        System.out.println("Recursion: " + n);
        recursion(n + 1);
    }

}