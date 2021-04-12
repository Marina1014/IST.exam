public class LavCarbDiet extends Diet {
    private float minWeightKg;

    public LavCarbDiet(float minWeightKg){
        this.minWeightKg = minWeightKg;
    }

    public float getMinWeightKg() {
        return minWeightKg;
    }

    public void setMinWeightKg(float minWeightKg) {
        this.minWeightKg = minWeightKg;
    }

    //The max carb-type foods that can be included in a LowCarbDiet is two

}
