package com.example.springcoredemo.config;

import com.example.springcoredemo.common.Coach;
import com.example.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach aquatic() {
        return new SwimCoach();
    }

}
