package decorator;

import decorator.flying.flyingInterface;
import decorator.quacking.QuackingInterface;

public abstract class Duck {
    protected flyingInterface fly;
    protected QuackingInterface quack;

    public void swim(){
        System.out.println("Swim");
    }
    public void letsFly(){
        fly.flying();
    }
    public void letsQuack(){
        quack.quack();
    }
    public void setQuack(QuackingInterface Quack){
        this.quack = quack;
    }
    public void setFly(flyingInterface Fly){
        this.fly = fly;
    }
    public abstract void print();

}
