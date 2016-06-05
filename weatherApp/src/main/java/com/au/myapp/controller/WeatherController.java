package com.au.myapp.controller;

import com.au.myapp.domain.Weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherController {
    Logger log = LoggerFactory.getLogger("WeatherController.class");
    private static final String view = "index";
    //E dd.mm.yyyy hh:mm aa
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yy hh.mm.ss.S aa");

    @RequestMapping(value = "/{city}", method = RequestMethod.GET)
    public String getWeather(@PathVariable String city, ModelMap model) {

        model.addAttribute("message", "the weather in this city is " + city);
        return view;

    }

    private void displayWeather(Weather weather){
        Date date = new Date(weather.date);
        System.out.print(" Weather information for your city : " +weather.city
                + "\n temp: "+weather.temperature
                + "\n wind speed: "+weather.windSpeedPerHour
                + "\n date time: "+simpleDateFormat.format(date)
                + "\n rain : "+weather.isItRaining
                + "\n description: "+ weather.description);
    }

}