package com.victor.bbqcalculator.service;

import com.victor.bbqcalculator.dto.CalculationRequest;
import com.victor.bbqcalculator.dto.CalculationResponse;
import com.victor.bbqcalculator.model.HungerLevel;

public class CalculationService {

    private static final int MEAT_GRAM_PER_ADULT = 400;
    private static final int MEAT_GRAM_PER_CHILD = 200;

    public CalculationResponse calculate (CalculationRequest calculationRequest){
        int baseMeatGrams = calculationRequest.getAdults() * MEAT_GRAM_PER_ADULT + calculationRequest.getChildren() * MEAT_GRAM_PER_CHILD;
        double hungerMultiplayer = getHungerMultiplayer(calculationRequest.getHungerLevel());

        double totalMeat = baseMeatGrams * hungerMultiplayer / 1000.0;

        CalculationResponse response = new CalculationResponse();
        response.setTotalMeat(totalMeat);
        response.setComment(getComment(calculationRequest.getHungerLevel()));
        return response;
    }

    private String getComment(HungerLevel hungerLevel) {
        return switch (hungerLevel){
            case LOW -> "A civilized BBQ. Your guests might even leave some salad untouched.";
            case NORMAL -> "Classic BBQ mode. Reasonable, safe, and socially acceptable.";
            case HIGH -> "Serious appetite detected. Better keep the grill hot.";
            case LEGENDARY -> "This is not a BBQ anymore. This is a strategic meat operation.";
        };
    }

    private double getHungerMultiplayer(HungerLevel hungerLevel) {
        return switch (hungerLevel) {
            case LOW -> 0.85;
            case NORMAL -> 1.0;
            case HIGH -> 1.25;
            case LEGENDARY -> 1.5;
        };
    }
}
