package decorator.flying;

public class CantFly implements flyingInterface {
    @Override
    public void flying() {
        System.out.println(":(");

    }
}
