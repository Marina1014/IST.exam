public abstract class Diet {
    private int daysDuration;
    private String purpose;
    private Food[] allowedFood;
    private boolean isVegan;

    public Diet(){
        this.daysDuration = daysDuration;
        this.purpose = purpose;
        this.allowedFood = allowedFood;
        this.isVegan = isVegan;
    }

    public int getDaysDuration() {
        return daysDuration;
    }

    public void setDaysDuration(int daysDuration) {
        this.daysDuration = daysDuration;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Food[] getAllowedFood() {
        return allowedFood;
    }

    public void setAllowedFood(Food[] allowedFood) {
        this.allowedFood = allowedFood;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    /*
    3. The Diet class should implement the following methods:
        a. Write the duration of a diet in terms of years, months and days, e.g., “This
        VeganDiet lasts for 2 years, 3 months and 5 days”.
        b. Write the allowed food, e.g., “The following food is allowed in this
        FlexitarianDiet: Salad, Soup, Apple, Strawberry, Salmon”.

     */

    public String writeDuration(){
        return null;
    }

    public String writeAllowedFood(){
        return null;
    }

    //if allowedFood contains non vegan food then isVegan = false


    //if allowed food contains only vegan food then isVegan = true
}
