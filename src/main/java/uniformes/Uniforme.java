package uniformes;

import atributosPrenda.CategoriaPrenda;
import prendas.Prenda;

public class Uniforme {
    Prenda superior;
    Prenda inferior;
    Prenda calzado;

    private Uniforme(Prenda superior, Prenda inferior, Prenda calzado){
        this.superior = superior;
        this.inferior = inferior;
        this.calzado = calzado;
    }

    public static Uniforme fabricar(Sastre sastre){
        return new Uniforme(sastre.fabricarParteSuperior(),sastre.fabricarParteInferior(),sastre.fabricarCalzado());
    }
}
