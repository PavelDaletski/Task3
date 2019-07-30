public class CarDemo {
    public static void main(String[] args) {

        CarEquipment carEquipment =new CarEquipment(1,2830,"Red");
        CarEquipment carEquipment1 = new CarEquipment(2,1895,"Red");
        Engine engine = new Engine(1,5912,"TSI");
        Engine engine1 = new Engine(2,6452,"TFSI");
        Transmission transmission = new Transmission(1,3349,"DSG");
        Transmission transmission1 = new Transmission(2,4353,"Robot");
        BodyCars bodyCars = new BodyCars(1,2243, "Hatchbak");
        BodyCars bodyCars1 = new BodyCars(2,3178, "Sedan");
        Door door = new Door(1,3431,"Red");
        Door door1 = new Door(2,4378,"Red");



        Car car=new Car(engine, door, transmission, bodyCars, carEquipment);
        Car car1 = new Car(engine1, door1, transmission1 ,bodyCars1, carEquipment1);

        Engine newEngine=car1.getEngine();
        newEngine.setPrice(5478);






        System.out.println("Car=" +CarDetali.carPrice(car));
        System.out.println("Car2="+CarDetali.carPrice(car1));

    }
}
