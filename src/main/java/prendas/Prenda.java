package prendas;

import atributosPrenda.CategoriaPrenda;
import atributosPrenda.Tela;
import atributosPrenda.TipoPrenda;
import atributosPrenda.Trama;

public class Prenda {
    TipoPrenda tipoPrenda;
    CategoriaPrenda categoriaPrenda;
    Tela tela;
    Trama trama;
    String colorPrimario;
    String colorSecundario;
    double temperaturaHasta;

    public Prenda(TipoPrenda tipoPrenda, CategoriaPrenda categoria, Tela tela, Trama trama,
                  String color1, String color2, double temperaturaHasta){
        this.tipoPrenda = tipoPrenda;
        this.categoriaPrenda = categoria;
        this.tela = tela;
        this.trama = trama;
        this.colorPrimario = color1;
        this.colorSecundario = color2;
        this.temperaturaHasta = temperaturaHasta;
    }


}
