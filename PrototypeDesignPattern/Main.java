package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Creta creta = new Creta();
        creta.brand = "Hyundai";
        creta.engine = "Normal";
        creta.color = "White";
        creta.manualGear = "Yes";

        cars.add(creta);
        Creta anotherCreta = (Creta) creta.clone();
        anotherCreta.manualGear = "No";
        
        cars.add(anotherCreta);

        R8 r8 = new R8();
        r8.brand = "Audi";
        r8.engine = "SuperFast";
        r8.superCar = "Yes";

        cars.add(r8);
        R8 anotherR8 = (R8) r8.clone();
        anotherCreta.color = "Red";

        cars.add(anotherR8);
        
    }

    /*
     * 1. It is a creational design pattern.
     * 
     * ADVANTAGES:
     * 1. It improves the performance as cloning is faster than creating objects from scratch.
     * 2. It reduces code duplication as common object initialization logic resides in the prototype.
     * 3. New object configurations can be created at runtime without modifying the code.
     * 4. Supports Open/Closed principle as adding new object types doesnt require changing existing code.
     * 5. Allows creating object with slight variations without affecting the prototype.
     * 
     * DISADVANTAGES:
     * 1. Deep cloning can be challenging and error-prone, especially for objects with nested references.
     * 2. It requires all prototype objects to implement cloning mechanism, which is not always feasible.
     * 3. Careless cloning can lead to increased memory consumption if unnecessary copies are created.
     * 4. Best build for scenarios where complex object creation is involved, not for simple objects.
     */

}
