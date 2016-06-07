<<<<<<< HEAD
import com.au.myapp.domain.Weather;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.bitpipeline.lib.owm.OwmClient;
import org.bitpipeline.lib.owm.StatusWeatherData;
import org.bitpipeline.lib.owm.WeatherData;
import org.bitpipeline.lib.owm.WeatherStatusResponse;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by vidya on 4/06/2016.
 */
public class TestWeatherAPI extends TestCase{
    private static final Logger logger = LoggerFactory.getLogger(TestWeatherAPI.class);
    private WeatherStatusResponse currentWeather;
    private OwmClient owm;
    private Weather weather;
    private String city;

    //E dd.mm.yyyy hh:mm aa
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E hh.mm.ss");

    public void setUp(){
        weather = new Weather();
        owm = new OwmClient ();
        city = "Melbourne";
    }
    public void testWeather(){
        try {
            currentWeather = owm.currentWeatherAtCity(city);
        }catch (JSONException jsone){
            logger.error("Exception "+jsone.getMessage());
        }catch (IOException ioe){
            logger.error("Exception "+ioe.getMessage());
        }
        if (currentWeather.hasWeatherStatus ()) {
            //todo check weather status null check
            weather = getWeather();
            displayWeather(weather);
        }
        logger.info(" Weather in "+currentWeather.getMessage());
 //       Assert.assertEquals();
    }

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
            if(weatherData.hasRain()){
                weather.isItRaining = "its raining";
            }else
                weather.isItRaining = "its not raining";
        }
    return weather;
    }

    private void displayWeather(Weather weather){
        Date date = new Date(weather.date);
        System.out.print(" Weather information for your City : " +weather.city
                + "\n temp: "+weather.temperature
                + "\n wind speed: "+weather.windSpeedPerHour
                + "\n date time: "+simpleDateFormat.format(date)
                + "\n rain : "+weather.isItRaining
                + "\n description: "+ weather.description);
    }

    public void tearDown(){
        currentWeather = null;
    }
}
=======
import com.au.myapp.domain.Weather;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.bitpipeline.lib.owm.OwmClient;
import org.bitpipeline.lib.owm.StatusWeatherData;
import org.bitpipeline.lib.owm.WeatherData;
import org.bitpipeline.lib.owm.WeatherStatusResponse;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by vidya on 4/06/2016.
 */
public class TestWeatherAPI extends TestCase{
    private static final Logger logger = LoggerFactory.getLogger(TestWeatherAPI.class);
    private WeatherStatusResponse currentWeather;
    private OwmClient owm;
    private Weather weather;
    private String city;

    //E dd.mm.yyyy hh:mm aa
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yy hh.mm.ss.S aa");

    public void setUp(){
        weather = new Weather();
        owm = new OwmClient ();
        city = "Melbourne";
    }
    public void testWeather(){
        try {
            currentWeather = owm.currentWeatherAtCity(city);
        }catch (JSONException jsone){
            logger.error("Exception "+jsone.getMessage());
        }catch (IOException ioe){
            logger.error("Exception "+ioe.getMessage());
        }
        if (currentWeather.hasWeatherStatus ()) {
            //todo check weather status null check
            weather = getWeather();
            displayWeather(weather);
        }
        logger.info(" Weather in "+currentWeather.getMessage());
 //       Assert.assertEquals();
    }

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
            if(weatherData.hasRain()){
                weather.isItRaining = "its raining";
            }else
                weather.isItRaining = "its not raining";
        }
    return weather;
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

    public void tearDown(){
        currentWeather = null;
    }
}
>>>>>>> 0aebb105aced783323774a08140558aa0c604bcd
