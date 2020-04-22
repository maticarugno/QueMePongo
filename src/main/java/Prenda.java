import categoriasDePrendas.CategoriaPrenda;
import excepciones.DatoNecesarioException;
import excepciones.TipoCategoriaNoCoincidenException;
import telas.Tela;
import tiposDePrendas.TipoPrenda;

public class Prenda {
    TipoPrenda tipoPrenda;
    CategoriaPrenda categoriaPrenda;
    Tela tela;
    String colorPrimario;
    String colorSecundario;

    public Prenda(TipoPrenda tipoPrenda, CategoriaPrenda categoria, Tela tela,
                  String color1, String color2){
        if(tipoPrenda==null){throw new DatoNecesarioException("El tipo de la prenda no puede estar vacio");}
        if(categoria==null){throw new DatoNecesarioException("La categoria de la prenda no puede estar vacio");}
        if(tela==null){throw new DatoNecesarioException("La tela de la prenda no puede estar vacio");}
        if(color1==null){throw new DatoNecesarioException("El color primario de la prenda no puede estar vacio");}

        if (tipoPrenda.categoriaPrenda != categoria) {
            throw new TipoCategoriaNoCoincidenException("El tipo de prenda no coincide con la categoria");
        }

        this.tipoPrenda = tipoPrenda;
        this.categoriaPrenda = categoria;
        this.tela = tela;
        this.colorPrimario = color1;
        this.colorSecundario = color2;
    }
}
