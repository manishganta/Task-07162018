package com.manish.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service
@Profile({"sunny", "default"})
public class SunnyDayService implements WeatherService {

    @Override
    public String forecast() {
        return "Today is a very very beautiful day!";
    }

}