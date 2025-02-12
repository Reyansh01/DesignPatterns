package SingletonDesignPattern;

public class Main {
    
    public static void main(String[] args) {
        Single single = Single.getInstance("Reyansh", 23);
        System.out.println("Name: " + single.getName() + " Age: " + single.getAge());
        Single single2 = Single.getInstance("Friend", 25);
        System.out.println("Name: " + single2.getName() + " Age: " + single2.getAge());
    }

    /*
     * 1. It is a creational design pattern.
     * 
     * ADVANTAGES:
     * 1. Ensures consistent access to a single instance.
     * 2. Prevents unnecessary object creation, especially for expensive-to-create objects.
     * 3. No need to pass shared resources explicitly.
     * 4. Useful for managing global application states, such as configs settings or caches.
     * Example -> DB object in the codebase.
     * 
     * DISADVANTAGES:
     * 1. Can lead to tightly coupled code, as maintaining and testing is painful.
     * 2. Makes code harder to understand as it introduces implicit (Hidden) dependencies.
     * 3. Improper implememtation in a multi-threaded environment can lead to creation of multiple objects.
     * 4. Singletons can complicate testing due to global state.
     * 5. It violates the SRP principle -> Single Responsibility Principle which states that 
     *      a class should have only one reason to change—it should be responsible for only one thing.
     *      It violates because:
     *      a. It manages its own lifecycle: Ensuring only one instance exists and controlling its creation.
     *      b. Performing its primary function: Doing the work it is designed for (eg -> managing configs, logging etc).
     *      This is bad because any change in the instance management logic (eg. adding thread safety) could affect
     *      the class's primary functionality and vice versa.
     *   This implementation also violates SRP as:
     *      ❌ Your current Singleton violates SRP because it manages instance creation & holds data (getter setter).
     *      ✅ The better approach is to separate data storage from instance management.
     */

}
