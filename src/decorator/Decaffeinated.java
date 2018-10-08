package decorator;

public class Decaffeinated extends Coffee {
public Decaffeinated(){
    description = "decaffeinated coffee";
}

    @Override
    public double cost() {
        return 10.99;
    }
}
