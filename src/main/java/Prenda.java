import categoriasDePrendas.CategoriaPrenda;
import telas.Tela;
import tiposDePrendas.TipoPrenda;
import tramas.Trama;

public class Prenda {
    TipoPrenda tipoPrenda;
    CategoriaPrenda categoriaPrenda;
    Tela tela;
    Trama trama;
    String colorPrimario;
    String colorSecundario;

    public Prenda(TipoPrenda tipoPrenda, CategoriaPrenda categoria, Tela tela, Trama trama,
                  String color1, String color2){
        this.tipoPrenda = tipoPrenda;
        this.categoriaPrenda = categoria;
        this.tela = tela;
        this.trama = trama;
        this.colorPrimario = color1;
        this.colorSecundario = color2;
    }


}
