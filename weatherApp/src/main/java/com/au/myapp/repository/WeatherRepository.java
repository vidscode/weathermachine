package com.au.myapp.repository;

import com.au.myapp.domain.City;
import com.au.myapp.domain.Weather;
import java.util.List;

/**
 * Created by vidya on 4/06/2016.
 */
public interface WeatherRepository {
    public List<City> getCities();
    public Weather getWeather(String cityName);
}
