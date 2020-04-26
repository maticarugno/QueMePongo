package uniformes;

import atributosPrenda.CategoriaPrenda;
import atributosPrenda.Tela;
import atributosPrenda.TipoPrenda;
import prendas.BuilderPrenda;
import prendas.Prenda;

public class SastreSanJuan implements Sastre{

    @Override
    public Prenda fabricarParteSuperior() {
        BuilderPrenda parteSuperior = new BuilderPrenda();
        parteSuperior.tipoPrenda(TipoPrenda.CHOMBA);
        parteSuperior.cateriaPrenda(CategoriaPrenda.SUPERIOR);
        parteSuperior.colorPrimario("verde");
        parteSuperior.tela(Tela.PIQUE);
        return parteSuperior.guardarPrenda();
    }

    @Override
    public Prenda fabricarParteInferior() {
        BuilderPrenda parteInferrior = new BuilderPrenda();
        parteInferrior.tipoPrenda(TipoPrenda.PANTALON);
        parteInferrior.cateriaPrenda(CategoriaPrenda.INFERIOR);
        parteInferrior.colorPrimario("gris");
        parteInferrior.tela(Tela.ACETATO);
        return parteInferrior.guardarPrenda();
    }

    @Override
    public Prenda fabricarCalzado() {
        BuilderPrenda calzado = new BuilderPrenda();
        calzado.tipoPrenda(TipoPrenda.ZAPATILLA);
        calzado.cateriaPrenda(CategoriaPrenda.CALZADO);
        calzado.colorPrimario("blanca");
        calzado.tela(Tela.ALGODON);
        return calzado.guardarPrenda();
    }
}
