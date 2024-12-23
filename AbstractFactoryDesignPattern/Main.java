package AbstractFactoryDesignPattern;

public class Main {
    
    public static void main(String[] args) {
        AnimalAbstractFactory animalAbstractFactory = new AnimalAbstractFactory();
        Animal animal = animalAbstractFactory.createAnimalObj("dinosaur", true);
        animal.printAnimal();
        Animal animal2 = animalAbstractFactory.createAnimalObj("tiger", false);
        animal2.printAnimal();
    }

    /*
     * 1. It is a creational design pattern.
     * 
     * ADVANTAGES:
     * 1. Has a centralized place for object creation from a family.
     * 2. Ensures that all the objects that are being created are compatible with each other.
     * 3. Loosely coupled as new families of objects can be introduced.
     * 4. 
     * 
     * DISADVANTAGES:
     * 1. It introduces a new layer of complexity which might not be needed everytime.
     * 2. Debugging gets difficult as the object creation is dynamic.
     * 3. Dependency on factory increases as direct object creation will not be there.
     * 4. Adding new types of families may required modifying all factory interfaces and implementations.
     */

}
