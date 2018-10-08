package decorator;

import decorator.flying.CantFly;
import decorator.quacking.Squeak;

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
