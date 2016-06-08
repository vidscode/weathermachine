import com.au.myapp.domain.Weather;
import com.au.myapp.repository.WeatherRepositoryImpl;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by vidya on 9/06/2016.
 */
public class TestWeatherRepository extends TestCase {

    @Autowired
    WeatherRepositoryImpl weatherRepo;

    public void setUp(){

    }

    public void testGetListOfCities(){
        List<String> listCities = weatherRepo.getListOfCities();
        Assert.assertTrue(listCities.size() > 0);
    }

    public void testGetWeather(){
        Weather weather = weatherRepo.getWeather("Sydney");
        Assert.assertEquals("Sydney", weather.city);
    }
    public void tearDown(){

    }

}
