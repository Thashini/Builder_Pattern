class CarBuilder {
    private String make;
    private String model;
    private int year;
    private String color;
    private int engineSize;
    private int doors;

    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setEngineSize(double d) {
        this.engineSize = (int) d;
        return this;
    }

    public CarBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.make = this.make;
        car.model = this.model;
        car.year = this.year;
        car.color = this.color;
        car.engineSize = this.engineSize;
        car.doors = this.doors;
        return car;
    }
}
