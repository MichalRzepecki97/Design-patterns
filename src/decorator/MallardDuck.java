package decorator;

import decorator.flying.CanFly;
import decorator.quacking.Quack;

public class MallardDuck extends Duck{
public MallardDuck(){
    fly = new CanFly();
    quack = new Quack();
}

    @Override
    public void print() {
        System.out.println("Printing MallardDuck");
    }
}
