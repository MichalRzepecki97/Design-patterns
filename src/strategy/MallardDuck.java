package strategy;

import strategy.flying.CanFly;
import strategy.quacking.Quack;

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
