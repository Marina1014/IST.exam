public class VeganDiet extends Diet{
    private float minWeightKg;

    public VeganDiet(float minWeightKg){
        super();
        this.minWeightKg = minWeightKg;
    }

    public float getMinWeightKg() {
        return minWeightKg;
    }

    public void setMinWeightKg(float minWeightKg) {
        this.minWeightKg = minWeightKg;
    }

    //A VeganDiet cannot contain nonVegan food
    //if getAllowedFood() == meat

}
