import accuWeather.AccuWeatherMock;
import accuWeather.Wheather;
import atributosPrenda.CategoriaPrenda;
import atributosPrenda.Trama;
import excepciones.DatoNecesarioException;
import excepciones.TipoCategoriaNoCoincidenException;
import guardarropas.Agregar;
import guardarropas.Guardarropa;
import guardarropas.Propuesta;
import guardarropas.Quitar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import prendas.BuilderPrenda;
import prendas.Prenda;
import atributosPrenda.Tela;
import atributosPrenda.TipoPrenda;
import uniformes.Sastre;
import uniformes.SastreSanJuan;
import uniformes.Uniforme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tests {
    Usuario usuario = new Usuario("Buenos Aires, Argentina");
    Guardarropa guardarropa = new Guardarropa();
    Prenda remera = new Prenda(TipoPrenda.REMERA,CategoriaPrenda.SUPERIOR,Tela.ALGODON, Trama.CUADROS,
            "blanca",null,60);
    Prenda pantalon = new Prenda(TipoPrenda.PANTALON,CategoriaPrenda.INFERIOR,Tela.ALGODON, Trama.LISA,
            "blanca",null,60);

    @Before
    public void init() {
        usuario.agregarGuardarropa(guardarropa);
    }

    @Test
    public void creoPrendaPorPartes(){
        BuilderPrenda remera = new BuilderPrenda();
        remera.tipoPrenda(TipoPrenda.REMERA);
        remera.cateriaPrenda(CategoriaPrenda.SUPERIOR);
        remera.colorPrimario("blanco");
        remera.tela(Tela.ALGODON);
        remera.temperaturaHasta(20);
        Prenda miRemera = remera.guardarPrenda();
    }


    @Test
    public void obtengoLaTemperatura(){
        Wheather apiClima = new AccuWeatherMock();
        Assert.assertEquals(57,apiClima.getTemperatura("Buenos Aires, Argentina"));
    }

    @Test
    public void agregoYAceptoPropuestaAgregar(){
        Propuesta propuesta = new Agregar(remera,guardarropa);
        usuario.agregarPropuesta(propuesta);
        usuario.aplicarPropuesta(0);
        Assert.assertTrue(guardarropa.getPrendas().contains(remera));
    }

    @Test
    public void agregoYAceptoYDeshagoPropuestaAgregar(){
        Propuesta propuesta = new Agregar(remera,guardarropa);
        usuario.agregarPropuesta(propuesta);
        usuario.aplicarPropuesta(0);
        usuario.deshacerPropuesta(0);
        Assert.assertFalse(guardarropa.getPrendas().contains(remera));
    }

    @Test(expected = TipoCategoriaNoCoincidenException.class)
    public void creoPrendaPorPartesNoValida(){
        BuilderPrenda remera = new BuilderPrenda();
        remera.tipoPrenda(TipoPrenda.REMERA);
        remera.cateriaPrenda(CategoriaPrenda.INFERIOR);
        remera.colorPrimario("blanco");
        remera.tela(Tela.ALGODON);
        Prenda miRemera = remera.guardarPrenda();
    }

    @Test(expected = DatoNecesarioException.class)
    public void tipoNoPuedeSerNull(){
        BuilderPrenda remera = new BuilderPrenda();
        remera.tipoPrenda(null);
        remera.cateriaPrenda(CategoriaPrenda.INFERIOR);
        remera.colorPrimario("blanco");
        remera.tela(Tela.ALGODON);
        Prenda miRemera = remera.guardarPrenda();
    }

    @Test
    public void creoUnUniforme(){
        Sastre sastreSanJuan = new SastreSanJuan();
        Uniforme uniforme = Uniforme.fabricar(sastreSanJuan);
    }


}
