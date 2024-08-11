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

}
