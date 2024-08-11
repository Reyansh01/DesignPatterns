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

}
