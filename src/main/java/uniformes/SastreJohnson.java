package uniformes;

import atributosPrenda.CategoriaPrenda;
import atributosPrenda.Tela;
import atributosPrenda.TipoPrenda;
import prendas.BuilderPrenda;
import prendas.Prenda;

public class SastreJohnson implements Sastre {
    @Override
    public Prenda fabricarParteSuperior() {
        BuilderPrenda parteSuperior = new BuilderPrenda();
        parteSuperior.tipoPrenda(TipoPrenda.CAMISA);
        parteSuperior.cateriaPrenda(CategoriaPrenda.SUPERIOR);
        parteSuperior.colorPrimario("blanca");
        parteSuperior.tela(Tela.ALGODON);
        return parteSuperior.guardarPrenda();
    }

    @Override
    public Prenda fabricarParteInferior() {
        BuilderPrenda parteInferrior = new BuilderPrenda();
        parteInferrior.tipoPrenda(TipoPrenda.PANTALON);
        parteInferrior.cateriaPrenda(CategoriaPrenda.INFERIOR);
        parteInferrior.colorPrimario("negro");
        parteInferrior.tela(Tela.ACETATO);
        return parteInferrior.guardarPrenda();
    }

    @Override
    public Prenda fabricarCalzado() {
        BuilderPrenda calzado = new BuilderPrenda();
        calzado.tipoPrenda(TipoPrenda.ZAPATO);
        calzado.cateriaPrenda(CategoriaPrenda.CALZADO);
        calzado.colorPrimario("negro");
        calzado.tela(Tela.ALGODON);
        return calzado.guardarPrenda();
    }
}
