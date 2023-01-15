public class App {
    public static void main(String[] args) throws Exception {
        CarBuilder carBuilder = new CarBuilder();
        extracted2(carBuilder).setDoors(2);
        Car mustang = carBuilder.build();
        
        System.out.println(mustang.getMake()+" "+mustang.getModel()+" "+mustang.getYear()+" "+mustang.getColor()+" "+ mustang.getEngineSize()+" "+ mustang.getDoors());
        
    }

    private static CarBuilder extracted2(CarBuilder carBuilder) {
        return extracted(carBuilder);
    }

    private static CarBuilder extracted(CarBuilder carBuilder) {
        return carBuilder.setMake("Ford").setModel("Mustang").setYear(2022).setColor("Red").setEngineSize(3.7);
    }
}
