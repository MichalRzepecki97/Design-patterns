package decorator;

import decorator.flying.CanFly;
import decorator.flying.flyingInterface;

public abstract class Demo extends Duck {
    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        md.letsFly();
        flyingInterface fly = new CanFly();
        md.setFly(fly);
        md.letsFly();

    }
}


