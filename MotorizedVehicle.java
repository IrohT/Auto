public class MotorizedVehicle {
    private float fuelLevel;
    private int maxFuelCapacity;
    private final int tireCount = 4;
    private int baseWeight;


    public float getFileLevel() {
        return fuelLevel;
    }

    public int getMaxFuelCapacity() {
        return maxFuelCapacity;
    }

    public int getTireCount() {
        return tireCount;
    }

    public int getBaseWeight() {
        return baseWeight;
    }

    public void setFileLevel(float fileLevel) {
        this.fuelLevel = fileLevel;
    }


    @Override
    public String toString() {
        return "MotorizedVehicle{" +
                "fullLevel=" + fuelLevel +
                ", maxFuelCapacity=" + maxFuelCapacity +
                ", tireCount=" + tireCount +
                ", baseWeight=" + baseWeight +
                '}';
    }

    public MotorizedVehicle(int maxFuelCapacity, int weight) {

        if(weight >= 0){
            this.baseWeight = weight;
        }
        if(fuelLevel <= maxFuelCapacity ){
            this.fuelLevel = maxFuelCapacity;
        }


    }


    public float avarageConsumption() {
        return (float) (5 * (Math.sqrt((float) baseWeight / 1302)));
    }

    public boolean go(float km){

        return true;
    }

    public void refuel(float i){

        if(i + this.fuelLevel > this.maxFuelCapacity){
            this.fuelLevel =  maxFuelCapacity;
        }

        else{
            this.fuelLevel += i;
        }


    }

    public int range(){
    return 0;
    }

}

