import clima.Clima;
import clima.ObtenerClima;
import prendas.Prenda;

import java.util.List;
import java.util.stream.Collectors;

public class Usuario implements GeneradorSugerencias{
    String ciudad;
    List<Prenda> prendas;

    public List<Sugerencia> obtenerSugerencia(){
        //buscar prendas aptas y llamar a generarSugerenciaDesde
        return generarSugerenciaDesde(prendasAptas());
    }

    public List<Prenda> prendasAptas(){
        Clima temperatura = new ObtenerClima();
        return this.prendas.stream()
                .filter(prenda -> prenda.getTemperaturaHasta() > temperatura.temperatura(ciudad))
                .collect(Collectors.toList());
    }

    @Override
    public List<Sugerencia> generarSugerenciaDesde(List<Prenda> prendasAptas) {
        return null;
    }
}
