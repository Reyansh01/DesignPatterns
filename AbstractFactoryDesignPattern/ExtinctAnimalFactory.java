package AbstractFactoryDesignPattern;

public class ExtinctAnimalFactory implements AnimalFactory {

    @Override
    public Animal getAnimal(String animalType) {
        if("dinosaur".equals(animalType)) {
            return new Dinosaur();
        }
        return null;
    }
    
}
