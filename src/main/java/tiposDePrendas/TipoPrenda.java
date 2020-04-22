package tiposDePrendas;

import categoriasDePrendas.CategoriaPrenda;

public enum TipoPrenda {

    ZAPATO(CategoriaPrenda.CALZADO),
    REMERA(CategoriaPrenda.SUPERIOR),
    CAMISA(CategoriaPrenda.SUPERIOR),
    PANTALON(CategoriaPrenda.INFERIOR),
    GORRA(CategoriaPrenda.ACCESORIO);

    public CategoriaPrenda categoriaPrenda;

    TipoPrenda(CategoriaPrenda categoriaPrenda){
        this.categoriaPrenda = categoriaPrenda;
    }
}
