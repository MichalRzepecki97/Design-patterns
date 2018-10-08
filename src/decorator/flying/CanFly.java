package decorator.flying;

public class CanFly implements flyingInterface {

    @Override
    public void flying() {
        System.out.println("I can fly");
    }
}
