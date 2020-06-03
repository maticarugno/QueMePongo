import accuWeather.AccuWeatherMock;
import accuWeather.Wheather;
import guardarropas.Guardarropa;
import guardarropas.Propuesta;
import prendas.Prenda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario implements GeneradorSugerencias{
    String ciudad;
    List<Guardarropa> guardarropas = new ArrayList<>();
    List<Propuesta> propuestas = new ArrayList<>();

    public void agregarPropuesta(Propuesta propuesta){
        propuestas.add(propuesta);
    }

    public void aplicarPropuesta(Propuesta propuesta){
        propuesta.aplicar();
        propuestas.remove(propuesta);
    }

    public Usuario(String ciudad){
        this.ciudad = ciudad;
    }

    public void agregarPrenda(Prenda prenda, Guardarropa guardarropa){
        guardarropa.agregarPrenda(prenda);
    }

    public void agregarGuardarropa(Guardarropa guardarropa){
        guardarropas.add(guardarropa);
    }

    public List<Sugerencia> obtenerSugerencia(Guardarropa guardarropa){
        return generarSugerenciaDesde(guardarropa.prendasAptas(this.ciudad));
    }

    @Override
    public List<Sugerencia> generarSugerenciaDesde(List<Prenda> prendasAptas) {
        return null;
    }
}
