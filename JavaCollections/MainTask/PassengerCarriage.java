package MainTask;

public class PassengerCarriage extends Train {

    private int numberOfSeats;
    private int amountOfLuggage;

    public PassengerCarriage(int id, int averageSpeed, int comfortLevel, int yearOfIssue, int numberOfSeats, int amountOfLuggage) {
        super(id, averageSpeed, comfortLevel, yearOfIssue);
        this.numberOfSeats = numberOfSeats;
        this.amountOfLuggage = amountOfLuggage;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getAmountOfLuggage() {
        return amountOfLuggage;
    }

    public void setAmountOfLuggage(int amountOfLuggage) {
        this.amountOfLuggage = amountOfLuggage;
    }

    @Override
    public String toString() {
        return "PassengerCarriage{" +
                "numberOfSeats=" + numberOfSeats +
                ", amountOfLuggage=" + amountOfLuggage +
                '}';
    }
}
