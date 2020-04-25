import categoriasDePrendas.CategoriaPrenda;
import excepciones.DatoNecesarioException;
import excepciones.TipoCategoriaNoCoincidenException;
import org.junit.Assert;
import org.junit.Test;
import telas.Tela;
import tiposDePrendas.TipoPrenda;
import tramas.Trama;

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
        Prenda miRemera = remera.guardarPrenda();
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


}
