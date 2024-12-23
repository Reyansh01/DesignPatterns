package BuilderDesignPattern;

public class Main {
    
    public static void main(String[] args) {
        CarDTO carDTO = CarDTO.newBuilder().setName("Mercedes").build();
        System.out.println(carDTO.getName());
        System.out.println(carDTO.getWheels());
        CarDTO carDTO2 = carDTO.clone(carDTO).setWheels(5).build();
        System.out.println(carDTO2.getWheels());
    }

    /*
     * 1. It is a creational design pattern.
     * 
     * ADVANTAGES:
     * 1. Simplifies complex object creation by making parameters optional.
     * 2. Makes the code more readable.
     * 3. It supports immutable objects to be created.
     * 
     * DISADVANTAGES:
     * 1. Intoruces additional classes or interfaces which increases the code complexity.
     * 2. Not suitable for simple objects or simple object construction.
     * 3. Can lead to boiler-plate code when implementing multiple builders for same class.
     */

}
