public class Formula1Car extends RaceCar{
    private String team;

    private int pilotSkillLevel;


    public String getTeam() {
        return team;
    }

    public int getPilotSkillLevel() {
        return pilotSkillLevel;
    }



    public Formula1Car(int maxFuelCapacity, int weight, int horsePower, int topSpeed, String team, int pilotSkillLevel) {
        super(maxFuelCapacity, weight, horsePower, topSpeed);
        this.team = team;
        this.pilotSkillLevel = pilotSkillLevel;
    }

    public boolean betterThan(){
        return true;
    }


}

