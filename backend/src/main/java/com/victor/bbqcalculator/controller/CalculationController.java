package com.victor.bbqcalculator.controller;

import com.victor.bbqcalculator.dto.CalculationRequest;
import com.victor.bbqcalculator.dto.CalculationResponse;
import com.victor.bbqcalculator.service.CalculationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculate")
public class CalculationController {

    private final CalculationService calculationService;

    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @PostMapping
    public CalculationResponse calculate(@RequestBody CalculationRequest request) {
        return calculationService.calculate(request);
    }


}
