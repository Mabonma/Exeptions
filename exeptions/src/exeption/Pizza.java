package exeption;

public class Pizza extends Food {

    private PizzaType pizzaType;

    public Pizza() {
    }

    public Pizza(String name, int count, double price, PizzaType pizzaType) {
        super(name, count, price);
        this.pizzaType = pizzaType;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    @Override
    public double getPrice() {
        switch (pizzaType) {
            case small:
                return price * 0.75;
            case normal:
                return price;
            case big:
                return price * 1.25;
            case ultra:
                return price * 1.5;
            default:
                return 0;
        }
    }

    public static void getAllPrices(double price) {
        System.out.println("Small: " + price * 0.75 + "$\n" +
                "Normal: +" + price + "$\n" +
                "Big: " + price * 1.25 + "$\n" +
                "Ultra: " + price * 1.5 + '$');
    }

    public static void getPizzasSize(){
        System.out.println("Small: 0.4kg" +
                "\nNormal: + 0.6kg" +
                "\nBig: 0.9kg" +
                "\nUltra: 1.5kg");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", pizza type=" + pizzaType +
                '}';
    }
}
