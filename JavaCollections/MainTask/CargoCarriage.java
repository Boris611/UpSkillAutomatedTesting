package MainTask;

public class CargoCarriage extends Train {

    private String typeOfCargo;
    private int liftingCapacity;

    public CargoCarriage(int id, int averageSpeed, int comfortLevel, int yearOfIssue, String typeOfCargo, int liftingCapacity) {
        super(id, averageSpeed, comfortLevel, yearOfIssue);
        this.typeOfCargo = typeOfCargo;
        this.liftingCapacity = liftingCapacity;
    }

    public String getTypeOfCargo() {
        return typeOfCargo;
    }

    public void setTypeOfCargo(String typeOfCargo) {
        this.typeOfCargo = typeOfCargo;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public String toString() {
        return "CargoCarriage{" +
                "typeOfCargo='" + typeOfCargo + '\'' +
                ", liftingCapacity=" + liftingCapacity +
                '}';
    }
}
