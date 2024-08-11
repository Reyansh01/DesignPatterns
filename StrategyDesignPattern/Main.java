package StrategyDesignPattern;

// main client side code
public class Main {
    
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        
        shoppingCart.setPaymentStrategy(new DebitCardPayment());
        shoppingCart.checkout(1000);

        shoppingCart.setPaymentStrategy(new CreditCardPayment());
        shoppingCart.checkout(1500);
    }

}
