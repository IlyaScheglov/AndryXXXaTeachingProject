package moreobjects;

public class Pinguin implements Bird, Mlecopitayshee {
    @Override
    public String whoAmI() {
        return "I am a Pinguin";
    }

    @Override
    public void suckMilk() {
        System.out.println("Pinguin suck milk and dick");
    }

    @Override
    public String toString() {
        return "Pinguin";
    }
}
