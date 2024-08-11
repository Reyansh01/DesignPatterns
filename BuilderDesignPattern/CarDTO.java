package BuilderDesignPattern;

public class CarDTO {

    private String name;
    private String brand;
    private Integer wheels;
    private Integer windows;

    private CarDTO() {

    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getWheels() {
        return wheels;
    }

    public Integer getWindows() {
        return windows;
    }

    public static class Builder {
        private String name;
        private String brand;
        private Integer wheels;
        private Integer windows;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getBrand() {
            return brand;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Integer getWheels() {
            return wheels;
        }

        public Builder setWheels(Integer wheels) {
            this.wheels = wheels;
            return this;
        }

        public Integer getWindows() {
            return windows;
        }

        public Builder setWindows(Integer windows) {
            this.windows = windows;
            return this;
        }

        public CarDTO build() {
            CarDTO carDTO = new CarDTO();
            carDTO.name = this.getName();
            carDTO.brand = this.getBrand();
            carDTO.wheels = this.getWheels();
            carDTO.windows = this.getWindows();
            return carDTO;
        }
    }

    public Builder clone(CarDTO carDTO) {
        return new Builder().setName(carDTO.getName()).setBrand(carDTO.getBrand()).setWheels(carDTO.getWheels())
                .setWindows(carDTO.getWindows());
    }

}
