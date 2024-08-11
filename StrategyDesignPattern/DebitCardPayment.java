package StrategyDesignPattern;

// concrete strategy
public class DebitCardPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Payment via Debit Card for amount: " + amount);
    }

}
