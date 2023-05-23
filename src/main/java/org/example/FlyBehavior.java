package org.example;

public interface FlyBehavior {
    public void fly();
}
class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I’m flying!");
    }
}
class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can’t fly");
    }
}
class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I’m flying with a rocket!");
    }
}
