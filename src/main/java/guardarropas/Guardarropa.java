package guardarropas;

import accuWeather.AccuWeatherMock;
import accuWeather.Wheather;
import prendas.Prenda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Guardarropa {
    String nombre;
    List<Prenda> prendas = new ArrayList<>();

    public Guardarropa(String nombre){
        this.nombre = nombre;
    }

    public void agregarPrenda(Prenda prenda){
        prendas.add(prenda);
    }

    public List<Prenda> prendasAptas(String ciudad){
        Wheather temperatura = new AccuWeatherMock();
        return this.prendas.stream()
                .filter(prenda -> prenda.getTemperaturaHasta() > temperatura.getTemperatura(ciudad))
                .collect(Collectors.toList());
    }


}
