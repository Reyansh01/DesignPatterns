package PrototypeDesignPattern;

public class R8 extends Car {
    
    public String superCar;

    public R8() {

    }

    public R8(R8 r8) {
        super(r8);
        if(r8 != null) {
            this.superCar = r8.superCar;
        }
    }

    @Override
    public Car clone() {
        return new R8(this);
    }

}
