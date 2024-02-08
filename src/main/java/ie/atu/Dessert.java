package ie.atu;

public class Dessert implements MenuItem {

    private double price;
    private String name;
    private String ingrediants;

    public Dessert (String name, double price, String ingrediants){
        this.name = name;
        this.price = price;
        this.ingrediants = ingrediants;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDesc() {
        return ingrediants;
    }
}
