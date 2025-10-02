import java.util.ArrayList;
//import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> option= new ArrayList<>();
        Pizza pizza=new Pizza("Pepperoni",12.5);
        Burger burger=new Burger("Cheese Burger",8.0);
        Drink drink=new Drink("Apple juice",2.5);
        System.out.println("Welcome to BiteHub 🍔🥂🍕");
        System.out.println("\nChoose your items:");
        System.out.println("1. Pizza ($"+pizza.getPrice()+")");
        System.out.println("2. Burger ($"+burger.getPrice()+")");
        System.out.println("3. Drink ($"+drink.getPrice()+")");
        System.out.println("4. Finish Order");
        System.out.print("\n> ");
        Scanner sc=new Scanner(System.in);
        int o1=sc.nextInt();
        if (o1 == 1) {
            pizza.prepare();
        }
          else  if (o1 == 2) {
                burger.prepare();
            }
          else if (o1 == 3) {
                    drink.prepare();
                }
               else    if ((o1 == 4)) {
                        System.out.println("Didn't buy any item");
                    } else {
                        System.out.println("Invalid input");
                    }
        option.add(o1);
        sc.nextLine();
        while(o1<5 && o1>0) {
            System.out.print("> ");
            o1=sc.nextInt();
            if (o1 == 1) {
                pizza.prepare();
            }
            else  if (o1 == 2) {
                burger.prepare();
            }
            else if (o1 == 3) {
                drink.prepare();
            }
            else    if ((o1 == 4)) {
                break;
            } else {
                System.out.println("Invalid input");
            }
            option.add(o1);
        }
        for(Integer x: option) {
            if (x == 1) {
                Order.orderItem(pizza);
            }
            else  if (x == 2) {
                Order.orderItem(burger);
            }
            else  {
                Order.orderItem(drink);
            }
        }
        Order.calculateTotal();
        Order.generateBill();
        PercentageDiscount p1=new PercentageDiscount(10);
        FixedDiscount f1=new FixedDiscount(2);
        System.out.println("Do you want a discount?");
        System.out.println("1. "+p1.getPercentage()+"% Off");
        System.out.println("2. $"+f1.getNumber()+ " Off");
        System.out.println("3. No discount");
        System.out.print("> ");
        int res=sc.nextInt();
        sc.nextLine();
        switch (res) {
            case 1:
                p1.applyDiscount(Order.sum);
                break;
            case 2:
                f1.applyDiscount(Order.sum);
                break;
            default:
                break;
        }
        while(true) {
            System.out.println("\n\nChoose payment method:");
            System.out.println("1. Cash");
            System.out.println("2. Card");
            System.out.println("3. Mobile money");
            System.out.print("> ");
            int res2 = sc.nextInt();
            sc.nextLine();
            switch (res2) {
                case 1:
                    cashPayment.pay(Order.sum);
                    break;
                case 2:
                    cardPayment.pay(Order.sum);
                    break;
                case 3:
                    mobilePayment.pay(Order.sum);
                    break;
                default:
                    System.out.println("Invalid input");
                    continue;
            }
            break;
        }
        System.out.println("Thank you for your order!");
    }
}