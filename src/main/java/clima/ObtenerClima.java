package clima;

import accuWeather.AccuWeatherAPI;
import accuWeather.Wheather;

import java.util.List;
import java.util.Map;

public class ObtenerClima implements Clima{
    @Override
    public int temperatura(String ciudad) {
        Wheather apiClima = new AccuWeatherAPI();
        List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(ciudad);
        return (int) condicionesClimaticas.get(0).get("PrecipitationProbability");
    }
}
