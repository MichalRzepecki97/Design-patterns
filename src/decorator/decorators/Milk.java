package decorator.decorators;

import decorator.Coffee;

public class Milk extends DecoratorComponent {
   Coffee coffee;

   public Milk (Coffee coffee){
       this.coffee = coffee;

   }

    @Override
    public String downloaddescription() {
        return downloaddescription()+ " with milk";
    }

    @Override
    public double cost() {
        return 1 +coffee.cost();
    }
}
