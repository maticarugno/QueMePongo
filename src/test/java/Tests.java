import atributosPrenda.CategoriaPrenda;
import excepciones.DatoNecesarioException;
import excepciones.TipoCategoriaNoCoincidenException;
import org.junit.Test;
import prendas.BuilderPrenda;
import prendas.Prenda;
import atributosPrenda.Tela;
import atributosPrenda.TipoPrenda;
import uniformes.Sastre;
import uniformes.SastreSanJuan;
import uniformes.Uniforme;

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

    @Test
    public void creoUnUniforme(){
        Sastre sastreSanJuan = new SastreSanJuan();
        Uniforme uniforme = Uniforme.fabricar(sastreSanJuan);
    }


}
