package decorator;

public class Latte extends Coffee {
    public Latte(){
        description = " Coffee Latte";
    }

    @Override
    public double cost() {
        return 7.50;
    }
}
