package com.victor.bbqcalculator.dto;

import com.victor.bbqcalculator.model.HungerLevel;
import com.victor.bbqcalculator.model.MeatType;

public class CalculationRequest {
    private int adults;
    private int children;
    private HungerLevel hungerLevel;
    private MeatType meatType;

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public HungerLevel getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(HungerLevel hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public void setMeatType(MeatType meatType) {
        this.meatType = meatType;
    }
}
