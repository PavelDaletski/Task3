import java.util.Objects;

public class Car {

    private Engine engine;
    private Door door;
    private Transmission transmission;
    private BodyCars bodyCars;
    private CarEquipment carEquipment;

    static {
        System.out.println("Ford focus");
        System.out.println("Skoda Rapid");
    }

    public Car(){


    }

    public Car(Engine engine, Door door, Transmission transmission, BodyCars bodyCars, CarEquipment carEquipment) {
        this.engine = engine;
        this.door = door;
        this.transmission = transmission;
        this.bodyCars = bodyCars;
        this.carEquipment = carEquipment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(engine, car.engine) &&
                Objects.equals(door, car.door) &&
                Objects.equals(transmission, car.transmission) &&
                Objects.equals(bodyCars, car.bodyCars) &&
                Objects.equals(carEquipment, car.carEquipment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, door, transmission, bodyCars, carEquipment);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", door=" + door +
                ", transmission=" + transmission +
                ", bodyCars=" + bodyCars +
                ", carEquipment=" + carEquipment +
                '}';
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public BodyCars getBodyCars() {
        return bodyCars;
    }

    public void setBodyCars(BodyCars bodyCars) {
        this.bodyCars = bodyCars;
    }

    public CarEquipment getCarEquipment() {
        return carEquipment;
    }

    public void setCarEquipment(CarEquipment carEquipment) {
        this.carEquipment = carEquipment;
    }
}