package com.example.restful_CT;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "FOODS")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "food_id")
    private long foodId;
    private String foodName;
    private String category;
    private String servingAmount;
    private String servingUnit;
    private double fat;
    private double calories;
    @OneToMany(mappedBy = "food")
    private List<Consumption> consumptionList;
    public Food()
    { }
    public Food(long foodId, String foodName, String category, String servingAmount, String servingUnit, double fat, double calories){
        this.foodId = foodId;
        this.foodName = foodName;
        this.category = category;
        this.servingAmount = servingAmount;
        this.servingUnit = servingUnit;
        this.fat = fat;
        this.calories = calories;
    }

    public void setFoodId(long foodId) {
        this.foodId = foodId;
    }

    public long getFoodId() {
        return foodId;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setServingAmount(String servingAmount) {
        this.servingAmount = servingAmount;
    }

    public String getServingAmount() {
        return servingAmount;
    }

    public void setServingUnit(String servingUnit) {
        this.servingUnit = servingUnit;
    }

    public String getServingUnit() {
        return servingUnit;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getFat() {
        return fat;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;
        Food food = (Food) o;
        return foodId == food.foodId &&
                Double.compare(food.fat, fat) == 0 &&
                Double.compare(food.calories, calories) == 0 &&
                foodName.equals(food.foodName) &&
                category.equals(food.category) &&
                servingAmount.equals(food.servingAmount) &&
                servingUnit.equals(food.servingUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodId, foodName, category, servingAmount, servingUnit, fat, calories);
    }
}
