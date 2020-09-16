package com.example.restful_CT;

public class ConsumptionNotFoundException extends RuntimeException{
    public ConsumptionNotFoundException(Long consumptionId){
        super("Cannot found the consumption record:" + consumptionId);
    }
}
