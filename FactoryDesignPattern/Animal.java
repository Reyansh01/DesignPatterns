package FactoryDesignPattern;

// can also be a interface but since we have some common attributes we created an abstract class.
public abstract class Animal {
    
    public abstract void printAnimal();

    // common attributes
    public int  numOfLegs() {
        return 4;
    }

}