package BuilderDesignPattern;

public class Main {
    
    public static void main(String[] args) {
        CarDTO carDTO = CarDTO.newBuilder().setName("Mercedes").build();
        System.out.println(carDTO.getName());
        System.out.println(carDTO.getWheels());
        CarDTO carDTO2 = carDTO.clone(carDTO).setWheels(5).build();
        System.out.println(carDTO2.getWheels());
    }

}
