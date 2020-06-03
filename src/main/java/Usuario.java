import accuWeather.AccuWeatherMock;
import accuWeather.Wheather;
import guardarropas.Guardarropa;
import prendas.Prenda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario implements GeneradorSugerencias{
    String ciudad;
    List<Guardarropa> guardarropas = new ArrayList<>();

    public Usuario(String ciudad){
        this.ciudad = ciudad;
    }

    public void agregarPrenda(Prenda prenda, Guardarropa guardarropa){
        guardarropa.agregarPrenda(prenda);
    }

    public List<Sugerencia> obtenerSugerencia(Guardarropa guardarropa){
        return generarSugerenciaDesde(guardarropa.prendasAptas(this.ciudad));
    }

    @Override
    public List<Sugerencia> generarSugerenciaDesde(List<Prenda> prendasAptas) {
        return null;
    }
}
