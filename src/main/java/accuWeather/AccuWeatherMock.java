package accuWeather;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class AccuWeatherMock implements Wheather{

    public final List<Map<String, Object>> getWeather(String ciudad) {
        return Arrays.asList(new HashMap<String, Object>(){{
            put("DateTime", "2019-05-03T01:00:00-03:00");
            put("EpochDateTime", 1556856000);
            put("WeatherIcon", 33);
            put("IconPhrase", "Clear");
            put("IsDaylight", false);
            put("PrecipitationProbability", 0);
            put("MobileLink", "http://m.accuweather.com/en/ar/villa-vil/7984/");
            put("Link", "http://www.accuweather.com/en/ar/villa-vil/7984");
            put("Temperature", new HashMap<String, Object>(){{
                put("Value", 57);
                put("Unit", "F");
                put("UnitType", 18);
            }});
        }});
    }

    @Override
    public List<Map<String, Object>> obtenerCondicionesClimaticas(String ciudad) {
        return getWeather(ciudad);
    }

    @Override
    public int getTemperatura(String ciudad) {
        List<Map<String, Object>> condicionesClimaticas = getWeather(ciudad);
        HashMap<String, Object> temperatura = (HashMap<String, Object>) condicionesClimaticas.get(0).get("Temperature");
        return (int) temperatura.get("Value");
    }
}
