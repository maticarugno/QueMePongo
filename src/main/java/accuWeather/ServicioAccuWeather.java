package accuWeather;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicioAccuWeather implements Wheather{
    @Override
    public List<Map<String, Object>> obtenerCondicionesClimaticas(String ciudad) {
        return null;
    }

    @Override
    public int getTemperatura(String ciudad) {
        AccuWeatherAPI apiClima = new AccuWeatherAPI();
        List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(ciudad);
        HashMap<String, Object> temperatura = (HashMap<String, Object>) condicionesClimaticas.get(0).get("Temperature");
        return (int) temperatura.get("Value");
    }
}
