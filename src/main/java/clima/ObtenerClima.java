package clima;

import accuWeather.AccuWeatherAPI;
import accuWeather.AccuWeatherMock;
import accuWeather.Wheather;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObtenerClima implements Clima{
    @Override
    public int temperatura(String ciudad) {
        Wheather apiClima = new AccuWeatherMock();
        List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(ciudad);
        HashMap<String, Object> temperatura = (HashMap<String, Object>) condicionesClimaticas.get(0).get("Temperature");
        return (int) temperatura.get("Value");
    }
}
