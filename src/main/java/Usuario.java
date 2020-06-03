import accuWeather.AccuWeatherMock;
import accuWeather.Wheather;
import prendas.Prenda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario implements GeneradorSugerencias{
    String ciudad;
    List<Prenda> prendas = new ArrayList<>();

    public Usuario(String ciudad){
        this.ciudad = ciudad;
    }

    public void agregarPrenda(Prenda prenda){
        prendas.add(prenda);
    }

    public List<Sugerencia> obtenerSugerencia(){
        //buscar prendas aptas y llamar a generarSugerenciaDesde
        return generarSugerenciaDesde(prendasAptas());
    }

    public List<Prenda> prendasAptas(){
        Wheather temperatura = new AccuWeatherMock();
        return this.prendas.stream()
                .filter(prenda -> prenda.getTemperaturaHasta() > temperatura.getTemperatura(ciudad))
                .collect(Collectors.toList());
    }

    @Override
    public List<Sugerencia> generarSugerenciaDesde(List<Prenda> prendasAptas) {
        return null;
    }
}
