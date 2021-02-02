package MainTask;

public class CargoCarriage extends Train {

    public String typeOfCargo;
    public int loadAmount;

    public CargoCarriage(int id, int averageSpeed, int quantityOfCarriage, String typeOfCarriage, String typeOfCargo, int loadAmount) {
        super(id, averageSpeed, quantityOfCarriage, typeOfCarriage);
        this.typeOfCargo = typeOfCargo;
        this.loadAmount = loadAmount;
    }

    public String getTypeOfCargo() {
        return typeOfCargo;
    }

    public void setTypeOfCargo(String typeOfCargo) {
        this.typeOfCargo = typeOfCargo;
    }

    public int getLoadAmount() {
        return loadAmount;
    }

    public void setLoadAmount(int loadAmount) {
        this.loadAmount = loadAmount;
    }


    @Override
    public String toString() {
        return "CargoCarriage{" +
                "typeOfCargo='" + typeOfCargo + '\'' +
                ", loadAmount=" + loadAmount +
                '}';
    }
}
