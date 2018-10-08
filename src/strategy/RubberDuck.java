package strategy;

import strategy.flying.CantFly;
import strategy.quacking.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck(){
        fly = new CantFly();
        quack = new Squeak();
    }

    @Override
    public void print() {
        System.out.println("Printing Rubber Duck");
    }
}
