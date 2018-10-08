package strategy.quacking;

public class Squeak implements QuackingInterface {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak!!!");
    }
}
