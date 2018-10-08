package strategy;

import strategy.flying.CantFly;
import strategy.quacking.CantQuack;

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
