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
    }

    private static void test(Car car) {
        car.wroomWroom();
    }

}