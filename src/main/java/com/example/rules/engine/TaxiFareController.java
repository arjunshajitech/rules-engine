package com.example.rules.engine;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TaxiFareController {

    final TaxiFareCalculatorService taxiFareCalculatorService;

    @GetMapping("/taxi-fare")
    public Fare taxiFare(@RequestParam("distance") Long distance,
                         @RequestParam("night") boolean night) {
        TaxiRide taxiRide = new TaxiRide();
        taxiRide.setIsNightSurcharge(night);
        taxiRide.setDistanceInMile(distance);
        Fare rideFare = new Fare();
        return taxiFareCalculatorService.calculateFare(taxiRide, rideFare);
    }
}
