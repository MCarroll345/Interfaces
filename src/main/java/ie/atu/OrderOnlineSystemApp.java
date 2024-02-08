package ie.atu;

public class OrderOnlineSystemApp {
    public static void main(String[] args){

        MenuItem[] menuItems = new MenuItem[] {

                new Burger("Chee",19,"Chee"),
                new Pizza("Chee Peez",12,"Chee & Peez"),
                new Salad("Chee Seed",19,"Chee & Seed"),
        };

        for(MenuItem menuItem : menuItems){
            System.out.println("Name: " +menuItem.getName() );
            System.out.println("Price: " +menuItem.getPrice() );
            System.out.println("Ingrediants: " +menuItem.getDesc() + "\n");
        }

        double totalCost = 0;
        for(MenuItem menuItem : menuItems){
            totalCost += menuItem.getPrice();
        }
        System.out.println("Total cost: €"+totalCost);

    }
}
