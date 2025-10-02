abstract class PaymentGateway {
    static void pay(double amount) {

    }
}
class cashPayment extends PaymentGateway {
    static void pay(double amount) {
        System.out.println("\nPaid $"+amount+" with Cash ✅");
    }
}
class cardPayment extends PaymentGateway {
    static void pay(double amount) {
        System.out.println("\nPaid $"+amount+" using Card ✅");
    }
}
class mobilePayment extends PaymentGateway {

    static void pay(double amount) {
        System.out.println("\nPaid $"+amount+" using Mobile ✅");
    }
}


interface Discountable {
    void applyDiscount(double totalAmount);
}
class PercentageDiscount implements Discountable {
     private double percentage;
    PercentageDiscount(double percentage) {
        this.percentage =percentage;
    }
    public void applyDiscount(double totalAmount) {
        double newAmount;
         newAmount=totalAmount*(percentage/100.0);
         System.out.printf("Total after discount: $%.2f",newAmount);
    }

    public double getPercentage() {
        return percentage;
    }
}
class FixedDiscount implements Discountable {
     private double number;
    FixedDiscount(double number) {
        this.number=number;
    }

    public double getNumber() {
        return number;
    }

    public void applyDiscount(double totalAmount) {
        double newAmount;
         newAmount=totalAmount-number;
        System.out.printf("Total after discount: $%.2f",newAmount);
    }
}


