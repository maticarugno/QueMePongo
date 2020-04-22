import categoriasDePrendas.CategoriaPrenda;
import excepciones.DatoNecesarioException;
import excepciones.TipoCategoriaNoCoincidenException;
import org.junit.Test;
import telas.Tela;
import tiposDePrendas.TipoPrenda;

public class Tests {
    CategoriaPrenda calzado = CategoriaPrenda.CALZADO;
    TipoPrenda zapato = TipoPrenda.ZAPATO;

    @Test(expected= DatoNecesarioException.class)
    public void tipoPrendaNoPuedeSerNull(){
        Prenda mocasines = new Prenda(zapato,null, Tela.CUERO,"negro","");
    }
    @Test(expected = DatoNecesarioException.class)
    public void telanoPuedeSerNull(){
        Prenda zapatillas = new Prenda(zapato,calzado,null,"negro","");
    }
    @Test(expected = TipoCategoriaNoCoincidenException.class)
    public void tipoYCategoriaNoCoincide(){
        Prenda remera = new Prenda(TipoPrenda.REMERA,CategoriaPrenda.INFERIOR,Tela.ALGODON,"verde","blanco");
    }

}
