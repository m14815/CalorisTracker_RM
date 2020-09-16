package com.example.restful_CT.controller;

import com.example.restful_CT.Consumption;
import com.example.restful_CT.ConsumptionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumptionController {
    private final ConsumptionRepository consumptionRepository;
    public ConsumptionController(ConsumptionRepository consumptionRepository){
        this.consumptionRepository = consumptionRepository;
    }
    @GetMapping(value = "/consumption")
    public List<Consumption> getConsumption(){
        return consumptionRepository.findAll();
    }
}
