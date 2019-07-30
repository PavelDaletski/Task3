import java.util.Objects;

public class CarEquipment {
    private int idCarEquiment;
    private int price;
    private String modelCarEquiment;

    public CarEquipment(){

    }


    public CarEquipment(int idCarEquiment, int price, String modelCarEquiment) {
        this.idCarEquiment = idCarEquiment;
        this.price = price;
        this.modelCarEquiment = modelCarEquiment;
    }

    public int getIdCarEquiment() {
        return idCarEquiment;
    }

    public void setIdCarEquiment(int idCarEquiment) {
        this.idCarEquiment = idCarEquiment;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModelCarEquiment() {
        return modelCarEquiment;
    }

    public void setModelCarEquiment(String modelCarEquiment) {
        this.modelCarEquiment = modelCarEquiment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarEquipment that = (CarEquipment) o;
        return idCarEquiment == that.idCarEquiment &&
                price == that.price &&
                Objects.equals(modelCarEquiment, that.modelCarEquiment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCarEquiment, price, modelCarEquiment);
    }

    @Override
    public String toString() {
        return "CarEquipment{" +
                "idCarEquiment=" + idCarEquiment +
                ", price=" + price +
                ", modelCarEquiment='" + modelCarEquiment + '\'' +
                '}';
    }
}
