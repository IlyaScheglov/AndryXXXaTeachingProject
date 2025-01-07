import objects.TestObject;
import objects.TestObjectExtender;
import oop.Car;
import oop.Priora;
import oop.Zhiguli;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Zhiguli zhiguli = new Zhiguli();
        Priora priora = new Priora();
        System.out.println("Zhiga");
        test(zhiguli);
        System.out.println("Priora");
        test(priora);
        cicli();
        sortirovka();
    }

    private static void test(Car car) {
        car.wroomWroom();
    }

    private static void cicli() {
//        for (int i = 0; i < 3; i++) {
//            System.out.println(i);
//        }
        int b = 0;
        do {
            System.out.println(b);
            b++;
        } while (b != 3);
    }

    private static void sortirovka() {
        int[] mas = {116, 34, 12, 16, 75};

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

}