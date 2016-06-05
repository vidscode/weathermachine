package com.au.myapp.repository;

import com.au.myapp.domain.Weather;
import org.bitpipeline.lib.owm.OwmClient;
import org.bitpipeline.lib.owm.StatusWeatherData;
import org.bitpipeline.lib.owm.WeatherData;
import org.bitpipeline.lib.owm.WeatherStatusResponse;
import org.json.JSONException;

import java.io.IOException;
import java.util.Date;

/**
 * Created by vidya on 4/06/2016.
 */
public class WeatherRepository {
    private WeatherStatusResponse currentWeather;
    private OwmClient owm = new OwmClient();;
    private Weather weather;
    private String city;

    private Weather getWeather(){
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

            if(weatherData.hasRain())
                weather.isItRaining = "its raining";
            else
                weather.isItRaining = "its not raining";
        }
        return weather;
    }
}
