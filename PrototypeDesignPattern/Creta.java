package PrototypeDesignPattern;

public class Creta extends Car {

    public String manualGear;

    public Creta() {

    }

    public Creta(Creta creta) {
        super(creta);
        if(creta != null) {
            this.manualGear = creta.manualGear;
        }
    }

    @Override
    public Car clone() {
        return new Creta(this);
    }

}
