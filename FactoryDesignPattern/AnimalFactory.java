package FactoryDesignPattern;

public class AnimalFactory {
    
    public Animal getAnimalObj(String animalType) {
        if("tiger".equals(animalType)) {
            return new Tiger();
        } else if("dog".equals(animalType)) {
            return new Dog();
        } else {
            return null;
        }
    }

}
