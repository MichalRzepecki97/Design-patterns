package decorator;

public abstract class Coffee {
    protected String description;

    public String downloaddescription(){
        return description;

    }
    public abstract double cost();

}
