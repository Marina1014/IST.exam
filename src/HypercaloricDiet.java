public class HypercaloricDiet extends  Diet {
    private float maxWeightKg;
    private float minCaloriesPerDay;

    public HypercaloricDiet(float maxWeightKg, float minCaloriesPerDay){
        this.maxWeightKg = maxWeightKg;
        this.minCaloriesPerDay = minCaloriesPerDay;
    }

    public float getMaxWeightKg() {
        return maxWeightKg;
    }

    public void setMaxWeightKg(float maxWeightKg) {
        this.maxWeightKg = maxWeightKg;
    }

    public float getMinCaloriesPerDay() {
        return minCaloriesPerDay;
    }

    public void setMinCaloriesPerDay(float minCaloriesPerDay) {
        this.minCaloriesPerDay = minCaloriesPerDay;
    }
}
