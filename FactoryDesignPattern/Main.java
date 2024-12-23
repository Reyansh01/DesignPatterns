package FactoryDesignPattern;

public class Main {
    
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.getAnimalObj("tiger");
        animal.printAnimal();
        Animal animal2 = animalFactory.getAnimalObj("dog");
        animal2.printAnimal();
        System.out.println(animal2.numOfLegs());
    }

    /*
     * 1. It is a creational design pattern.
     * 
     * ADVANTAGES:
     * 1. Has a centralized place for object creation.
     * 2. Loosely coupled as new types of objects can be introduced.
     * 
     * DISADVANTAGES:
     * 1. It introduces a new layer of complexity which might not be needed everytime.
     * 2. Debugging gets difficult as the object creation is dynamic.
     * 3. Dependency on factory increases as direct object creation will not be there.
     */

}
