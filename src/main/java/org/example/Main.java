package org.example;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyNoWay());
        model.performFly();
        System.out.println("This Pattern is STRATEGY");
    }
}