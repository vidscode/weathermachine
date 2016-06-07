package com.au.myapp.repository;

import com.au.myapp.domain.City;
import com.au.myapp.domain.Weather;
import org.bitpipeline.lib.owm.OwmClient;
import org.bitpipeline.lib.owm.StatusWeatherData;
import org.bitpipeline.lib.owm.WeatherData;
import org.bitpipeline.lib.owm.WeatherStatusResponse;
import org.json.JSONException;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by vidya on 4/06/2016.
 */
public interface WeatherRepository {
    public List<City> getCities();
    public Weather getWeather(String cityName);
}
