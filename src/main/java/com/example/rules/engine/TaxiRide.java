package com.example.rules.engine;

import lombok.Data;

@Data
public class TaxiRide {
    private Boolean isNightSurcharge;
    private Long distanceInMile;
}
