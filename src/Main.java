import objects.TestObject;
import objects.TestObjectExtender;
import oop.Car;
import oop.Priora;
import oop.Zhiguli;

public class Main {
    public static void main(String[] args) {
        Zhiguli zhiguli = new Zhiguli();
        Priora priora = new Priora();
        System.out.println("Zhiga");
        test(zhiguli);
        System.out.println("Priora");
        test(priora);
        cicli();
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

}