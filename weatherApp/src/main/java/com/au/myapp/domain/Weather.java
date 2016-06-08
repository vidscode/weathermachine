package com.au.myapp.domain;

import java.util.Date;

public class Weather {
    public String city;
    public float temperature;
    public Date date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
