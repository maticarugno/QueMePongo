package accuWeather;

import java.util.List;
import java.util.Map;

public interface Wheather {
    public List<Map<String,Object>> obtenerCondicionesClimaticas(String ciudad);
    public int getTemperatura(String ciudad);
}
