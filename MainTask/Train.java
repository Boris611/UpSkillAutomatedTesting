package MainTask;

public class Train extends Transport {

    public int quantityOfCarriage;
    public String typeOfCarriage;

    public Train(int id, int averageSpeed, int quantityOfCarriage, String typeOfCarriage) {
        super(id, averageSpeed);
        this.quantityOfCarriage = quantityOfCarriage;
        this.typeOfCarriage = typeOfCarriage;
    }

    public int getQuantityOfCarriage() {
        return quantityOfCarriage;
    }

    public void setQuantityOfCarriage(int quantityOfCarriage) {
        this.quantityOfCarriage = quantityOfCarriage;
    }

    public String getTypeOfCarriage() {
        return typeOfCarriage;
    }

    public void setTypeOfCarriage(String typeOfCarriage) {
        this.typeOfCarriage = typeOfCarriage;
    }

    @Override
    public String toString() {
        return "Train{" +
                "quantityOfCarriage=" + quantityOfCarriage +
                ", typeOfCarriage='" + typeOfCarriage + '\'' +
                '}';
    }

}
