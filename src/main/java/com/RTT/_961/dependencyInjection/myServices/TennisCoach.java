package com.RTT._961.dependencyInjection.myServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneServices fortuneService;

    // default constructor
    public TennisCoach() {
    }
    public TennisCoach(FortuneServices theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}






