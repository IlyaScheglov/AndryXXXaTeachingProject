package objects;

public class TestObject {

    private int x;
    private static int y = 20;

    public TestObject() {
        x = 1;
    }

    public TestObject(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public static int getStaticX() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printX() {
        System.out.println(x);
    }
}
