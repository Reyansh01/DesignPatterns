package AbstractFactoryDesignPattern;

public class Main {
    
    public static void main(String[] args) {
        AnimalAbstractFactory animalAbstractFactory = new AnimalAbstractFactory();
        Animal animal = animalAbstractFactory.createAnimalObj("dinosaur", true);
        animal.printAnimal();
        Animal animal2 = animalAbstractFactory.createAnimalObj("tiger", false);
        animal2.printAnimal();
    }

}
