package com.au.myapp.repository;

import com.au.myapp.domain.City;
import com.au.myapp.domain.Weather;
import org.bitpipeline.lib.owm.OwmClient;
import org.bitpipeline.lib.owm.StatusWeatherData;
import org.bitpipeline.lib.owm.WeatherData;
import org.bitpipeline.lib.owm.WeatherStatusResponse;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vidya on 4/06/2016.
 */

@Component
public class WeatherRepositoryImpl implements WeatherRepository {
    private WeatherStatusResponse currentWeather;
    private OwmClient owm = new OwmClient();
    private Weather weather;
    private List<String> listOfCities;

    private static final Logger logger = LoggerFactory.getLogger(WeatherRepositoryImpl.class);

    public Weather getWeather(String cityName){
        try {
            currentWeather = owm.currentWeatherAtCity(cityName);
        }catch (JSONException jsone){
            logger.error("Exception "+jsone.getMessage());
        }catch (IOException ioe){
            logger.error("Exception "+ioe.getMessage());
        }
        Weather weather = new Weather();
        String description = " No data available ";
        StatusWeatherData weatherData = currentWeather.getWeatherStatus().get(0);

        if(weatherData.hasWeatherConditions()) {
            WeatherData.WeatherCondition weatherCondition = weatherData.getWeatherConditions().get(0);
            description = weatherCondition.getDescription();
        }

        if(weatherData!=null){
            weather.city = weatherData.getName();
            weather.description = description;
            weather.date = weatherData.getDateTime();
            weather.temperature = weatherData.getTemp();
            weather.windSpeedPerHour = weatherData.getWindSpeed();

            if(weatherData.hasRain() == true)
                weather.isItRaining = "its raining";
            else
                weather.isItRaining = "its not raining";
        }
        return weather;
    }

    public List<City> getCities(){
        List<City> cities = new ArrayList<>();
        for(int i = 0; i < listOfCities.size();i++){
            City city = new City();
            city.name =listOfCities.get(i);
            cities.add(city);
        }
        return cities;
    }
    public List<String> getListOfCities() {
        return listOfCities;
    }

    public void setListOfCities(List<String> listOfCities) {
        this.listOfCities = listOfCities;
    }
}
