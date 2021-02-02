package MainTask;

public class PassengerCarriage extends Train {

    private int numberOfSeats;
    private String comfortLevel;

    public PassengerCarriage(int id, int averageSpeed, int quantityOfCarriage, String typeOfCarriage, int numberOfSeats, String comfortLevel) {
        super(id, averageSpeed, quantityOfCarriage, typeOfCarriage);
        this.numberOfSeats = numberOfSeats;
        this.comfortLevel = comfortLevel;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(String comfortLevel) {
        this.comfortLevel = comfortLevel;
    }

    @Override
    public String toString() {
        return "PassengerCarriage{" +
                "numberOfSeats=" + numberOfSeats +
                ", comfortLevel='" + comfortLevel + '\'' +
                '}';
    }
}
