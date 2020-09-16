package com.example.restful_CT;

public class FoodNotFoundException extends RuntimeException{
    public FoodNotFoundException(Long foodId){
        super("The food is not found: " + foodId);
    }
}
