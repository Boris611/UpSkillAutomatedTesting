package MainTask;

public class Train extends Transport {

    private int comfortLevel;
    private int yearOfIssue;

    public Train(int id, int averageSpeed, int comfortLevel, int yearOfIssue) {
        super(id, averageSpeed);
        this.comfortLevel = comfortLevel;
        this.yearOfIssue = yearOfIssue;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(int comfortLevel) {
        this.comfortLevel = comfortLevel;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Train{" +
                "comfortLevel=" + comfortLevel +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
