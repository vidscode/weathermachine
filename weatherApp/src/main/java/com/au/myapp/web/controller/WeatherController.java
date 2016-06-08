package com.au.myapp.web.controller;

import com.au.myapp.domain.Weather;
import com.au.myapp.domain.City;
import com.au.myapp.repository.WeatherRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class WeatherController {
    Logger log = LoggerFactory.getLogger("WeatherController.class");
    private static final String view = "index";

    //E dd.mm.yyyy hh:mm aa
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yy hh.mm.ss.S aa");

    @Autowired
    WeatherRepositoryImpl weatherRepo;

    @RequestMapping(value = "/City", method = RequestMethod.GET)
    public ModelAndView City(Model model) {
        List<City> cities = weatherRepo.getCities();
        model.addAttribute("cities", cities);
        return new ModelAndView("city", "command", new City());
    }

    @RequestMapping(value = "/findWeather", method = RequestMethod.POST)
    public ModelAndView findWeather(@ModelAttribute("SpringWeb") City city, ModelMap model) {
        log.debug("City selected " + city);
        Weather weather = weatherRepo.getWeather(city.name);
        model.addAttribute("City", weather.city);
        model.addAttribute("date", simpleDateFormat.format(weather.date));
        model.addAttribute("description", weather.description);
        log.debug("Weather is " + weather.description + "::" + weather.date);
        return new ModelAndView("result", "weather", weather);
    }

    private void displayWeather(Weather weather) {
        Date date = new Date(weather.date);
        System.out.print(" Weather information for your City : " + weather.city
                + "\n temp: " + weather.temperature
                + "\n wind speed: " + weather.windSpeedPerHour
                + "\n date time: " + simpleDateFormat.format(date)
                + "\n rain : " + weather.isItRaining
                + "\n description: " + weather.description);
    }
}