public class RaceCar extends MotorizedVehicle{
    private float tirePercentige;
    private int horsePower;
    private int baseHorsePower;
    private int topSpeed;


    public float getTirePercentige() {
        return tirePercentige;
    }

    public int getHorsePower() {
        return horsePower;
    }


    @Override
    public String toString() {
        return  "Ez egy " + horsePower +
                "loeros versenyauto, aminek" +
                ", baseHorsePower=" + baseHorsePower +
                ", topSpeed=" + topSpeed +
                '}';
    }

    public RaceCar(int maxFuelCapacity, int weight, int horsePower, int topSpeed) {
        super(maxFuelCapacity, weight);
        this.horsePower = horsePower;
        this.topSpeed = topSpeed;
    }

    public void changeTire(){

    }

    public void tune(){

    }

    public boolean canGo(){
        return true;
    }

    public int TopSpeed(){
        return 0;
    }
}
