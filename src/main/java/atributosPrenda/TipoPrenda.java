package atributosPrenda;

import atributosPrenda.CategoriaPrenda;

public enum TipoPrenda {

    ZAPATO(CategoriaPrenda.CALZADO),
    ZAPATILLA(CategoriaPrenda.CALZADO),
    REMERA(CategoriaPrenda.SUPERIOR),
    CHOMBA(CategoriaPrenda.SUPERIOR),
    CAMISA(CategoriaPrenda.SUPERIOR),
    PANTALON(CategoriaPrenda.INFERIOR),
    GORRA(CategoriaPrenda.ACCESORIO);

    public CategoriaPrenda categoriaPrenda;

    TipoPrenda(CategoriaPrenda categoriaPrenda){
        this.categoriaPrenda = categoriaPrenda;
    }
}
