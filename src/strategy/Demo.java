package strategy;

import strategy.flying.CanFly;
import strategy.flying.flyingInterface;

public abstract class Demo extends Duck {
    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        md.letsFly();
        flyingInterface fly = new CanFly();
        md.setFly(fly);
        md.letsFly();

    }
}


