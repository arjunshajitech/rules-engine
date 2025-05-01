package com.example.rules.engine;

import lombok.RequiredArgsConstructor;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaxiFareCalculatorService {

    final KieContainer kieContainer;

    public Fare calculateFare(TaxiRide taxiRide, Fare rideFare) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("rideFare", rideFare);
        kieSession.insert(taxiRide);
        kieSession.fireAllRules();
        kieSession.dispose();
        return rideFare;
    }

}
