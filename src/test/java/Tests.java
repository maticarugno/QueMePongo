import accuWeather.AccuWeatherAPI;
import accuWeather.AccuWeatherMock;
import accuWeather.Wheather;
import atributosPrenda.CategoriaPrenda;
import excepciones.DatoNecesarioException;
import excepciones.TipoCategoriaNoCoincidenException;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.junit.Assert;
import org.junit.Test;
import prendas.BuilderPrenda;
import prendas.Prenda;
import atributosPrenda.Tela;
import atributosPrenda.TipoPrenda;
import uniformes.Sastre;
import uniformes.SastreSanJuan;
import uniformes.Uniforme;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tests {
    CategoriaPrenda calzado = CategoriaPrenda.CALZADO;
    TipoPrenda zapato = TipoPrenda.ZAPATO;

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
    public void clima(){
        Wheather apiClima = new AccuWeatherMock();
        List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
        HashMap<String, Object> temperatura = (HashMap<String, Object>) condicionesClimaticas.get(0).get("Temperature");
        Assert.assertEquals(57,temperatura.get("Value"));
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
