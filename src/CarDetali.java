public class CarDetali {
    public static int carPrice (Car car){
        return car.getEngine().getPrice()+car.getTransmission().getPrice()+car.getDoor().getPrice()+car.getCarEquipment().getPrice()+
                car.getBodyCars().getPrice();
    }
}
