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

    /*
     * 1. It is a behvaioral design pattern.
     * 
     * ADVANTAGES:
     * 1. Makes easier to add or replace strategies without changing the client code.
     * 2. Each strategy is responsible for a single behavior i.e. follows SRP.
     * 3. Supports Open/Closed principle i.e. we can introduce new strategies without modifying the exisiting ones.
     * 4. Seperates the code for different algorithms , reducing dependencies.
     * 5. Strategies can be reused across multiple contexts or applications.
     * 
     * DISADVANTAGES:
     * 1. For every algorithm/strategy a new class is created.
     * 2. The client needs to understand and select the appropriate strategy, which might increase complexity.
     * 3. Switching algorithms dynamically might introduce additional complexity.
     * 4. Managing multiple strategies is challenging in large systems.
     */

}
