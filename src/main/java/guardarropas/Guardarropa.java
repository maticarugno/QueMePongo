package guardarropas;

import accuWeather.AccuWeatherMock;
import accuWeather.Wheather;
import prendas.Prenda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Guardarropa {
    List<Prenda> prendas = new ArrayList<>();

    public void agregarPrenda(Prenda prenda){
        prendas.add(prenda);
    }
    public void quitarPrenda(Prenda prenda){
        prendas.remove(prenda);
    }

    public List<Prenda> prendasAptas(String ciudad){
        Wheather temperatura = new AccuWeatherMock();
        return this.prendas.stream()
                .filter(prenda -> prenda.getTemperaturaHasta() > temperatura.getTemperatura(ciudad))
                .collect(Collectors.toList());
    }

    public List<Prenda> getPrendas() {
        return prendas;
    }
}
