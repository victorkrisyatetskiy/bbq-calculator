package com.victor.bbqcalculator.dto;

public class CalculationResponse {
    private double totalMeat;
    private String comment;

    public double getTotalMeat() {
        return totalMeat;
    }

    public void setTotalMeat(double totalMeat) {
        this.totalMeat = totalMeat;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
