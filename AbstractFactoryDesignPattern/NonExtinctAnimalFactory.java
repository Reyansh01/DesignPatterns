package AbstractFactoryDesignPattern;

public class NonExtinctAnimalFactory implements AnimalFactory {

    @Override
    public Animal getAnimal(String animalType) {
        if("tiger".equals(animalType)) {
            return new Tiger();
        }
        return null;
    }
    


}
