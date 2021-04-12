public class Person {
    private Food favoriteFood;
    private Food[] allergies;
    private Diet diet;
    private float weight;

    public Person(Food favoriteFood, Food[] allergies, Diet diet, float weight){
        this.favoriteFood = favoriteFood;
        this.allergies = allergies;
        this.diet = diet;
        this.weight = weight;
    }

    /*
    2. A person can be following any given diet, except in the following cases:
    a. If their favorite food is non-vegan, they cannot follow a VeganDiet.
    b. They cannot follow a diet if they are allergic to 50% or more of the food
    allowed by the diet.
    c. If they weigh less than the limit set by the VeganDiet or the LowCarbDiet, they
    cannot be following these diets (for health reasons).
    d. If they weigh more than the limit set by the HypercaloricDiet, they cannot be
    following this diet (for health reasons).

     */

    public Food getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(Food favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public Food[] getAllergies() {
        return allergies;
    }

    public void setAllergies(Food[] allergies) {
        this.allergies = allergies;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}

