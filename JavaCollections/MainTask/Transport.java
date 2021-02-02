package MainTask;

public class Transport {

    private int id;
    private int averageSpeed;

    public Transport(int id, int averageSpeed) {
        this.id = id;
        this.averageSpeed = averageSpeed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }


    @Override
    public String toString() {
        return "Transport{" +
                "id=" + id +
                ", averageSpeed=" + averageSpeed +
                '}';
    }
}
