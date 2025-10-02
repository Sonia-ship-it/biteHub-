import java.util.*;
 public class Order {
    static List <FoodItem> items=new ArrayList<>();
     static double sum=0.0;
    static void orderItem(FoodItem item) {
        items.add(item);
    }
    static void calculateTotal() {
        for(FoodItem x: items) {
            sum+=x.getPrice();
        }
    }
    static void generateBill() {
        System.out.println("\nYour total is: $"+sum);
    }
}
