public class FlexitarianDiet extends Diet {
    private float maxMeatGramsPerWeek;
    private Food preferedMeat;

    public FlexitarianDiet(float maxMeatGramsPerWeek, Food preferedMeat){
        this.maxMeatGramsPerWeek = maxMeatGramsPerWeek;
        this.preferedMeat = preferedMeat;
    }

    public float getMaxMeatGramsPerWeek() {
        return maxMeatGramsPerWeek;
    }

    public void setMaxMeatGramsPerWeek(float maxMeatGramsPerWeek) {
        this.maxMeatGramsPerWeek = maxMeatGramsPerWeek;
    }

    public Food getPreferedMeat() {
        return preferedMeat;
    }

    public void setPreferedMeat(Food preferedMeat) {
        this.preferedMeat = preferedMeat;
    }

    //The preferred meat must be non-vegan food of protein type


}
