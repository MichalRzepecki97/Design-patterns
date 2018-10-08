package decorator.decorators;

import decorator.Coffee;

public class Chocolate extends DecoratorComponent {
    Coffee coffee;

    public Chocolate(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String downloaddescription() {
        return coffee.downloaddescription()+" with chocolate";
    }

    @Override
    public double cost() {
        return 1.50 +coffee.cost();
    }
}
