package strategy.quacking;

public class CantQuack implements QuackingInterface {

    @Override
    public void quack() {
        System.out.println("******");
    }
}
