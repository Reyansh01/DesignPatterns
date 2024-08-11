package StrategyDesignPattern;

// concrete strategy
public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Payment via credit card for amount: " + amount);   
    }

}
