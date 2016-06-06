package com.au.myapp.domain;

import java.util.Date;

/**
 * Created by vidya on 5/06/2016.
 * City         Melbourne
 Updated time       Thursday 11:00 AM
 Weather Mostly Cloudy
 Temperature        9°C
 Wind       32km/h
 Technical requirement:
 */
public class Weather {
    public String city;
    public float temperature;
    public long date;
    public String description;
    public float windSpeedPerHour;


    public String isItRaining;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getWindSpeedPerHour() {
        return windSpeedPerHour;
    }

    public void setWindSpeedPerHour(float windSpeedPerHour) {
        this.windSpeedPerHour = windSpeedPerHour;
    }

    public String getIsItRaining() {
        return isItRaining;
    }

    public void setIsItRaining(String isItRaining) {
        this.isItRaining = isItRaining;
    }

}
