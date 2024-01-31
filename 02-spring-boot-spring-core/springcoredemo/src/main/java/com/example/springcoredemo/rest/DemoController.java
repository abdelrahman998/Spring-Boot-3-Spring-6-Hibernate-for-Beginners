package com.example.springcoredemo.rest;

import com.example.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jmx.export.metadata.ManagedOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach) {
        System.out.println("In Constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }



//
//    @GetMapping("/check")
//    public String check() {
//        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
//    }
}
