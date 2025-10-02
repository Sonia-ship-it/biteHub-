abstract class FoodItem {
    private String name;
    private double price;

    FoodItem(String name, double price) {
        this.name=name;
        this.price=price;
    }
    abstract void prepare();

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
class Burger extends FoodItem {
    Burger(String name, double price) {
        super(name, price);
    }
    void prepare() {
        System.out.println("Grilling burger : "+getName());
    }
}
class Pizza extends FoodItem {
    Pizza(String name, double price) {
        super(name, price);
    }
    void prepare() {
        System.out.println("Preparing pizza : "+getName());
    }
}
class Drink extends FoodItem {
    Drink(String name, double price) {
        super(name,price);
    }
    void prepare() {
        System.out.println("Pouring drink : "+getName());
    }
}