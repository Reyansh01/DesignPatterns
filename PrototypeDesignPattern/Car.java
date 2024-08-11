package PrototypeDesignPattern;

public abstract class Car {
    
    public String brand;
    public String engine;
    public String color;

    public abstract Car clone();

    public Car() {
        
    }

    public Car(Car car) {
        if(car != null) {
            this.brand = car.brand;
            this.engine = car.engine;
            this.color = car.color;
        }
    }

}
