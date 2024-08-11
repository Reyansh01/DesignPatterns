package AbstractFactoryDesignPattern;

public class AnimalAbstractFactory {
    
    public Animal createAnimalObj(String animalType, Boolean isExtinct) {
        AnimalFactory animalFactory = getAnimalFactory(isExtinct);
        return animalFactory.getAnimal(animalType);
    }

    private AnimalFactory getAnimalFactory(Boolean isExtinct) {
        if(isExtinct) {
            return new ExtinctAnimalFactory();
        } else {
            return new NonExtinctAnimalFactory();
        }
    }

}
