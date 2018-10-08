package decorator;

import decorator.flying.CantFly;
import decorator.quacking.CantQuack;

public class ModelDuck extends  Duck {

    public ModelDuck(){
        quack = new CantQuack();
        fly =new CantFly();

    }
    @Override
    public void print() {
        System.out.println("Printing model duck");
    }
}
