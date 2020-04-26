package prendas;

import atributosPrenda.CategoriaPrenda;
import excepciones.DatoNecesarioException;
import excepciones.TipoCategoriaNoCoincidenException;
import atributosPrenda.Tela;
import atributosPrenda.TipoPrenda;
import atributosPrenda.Trama;

public class BuilderPrenda {

    TipoPrenda tipoPrenda;
    CategoriaPrenda categoriaPrenda;
    Tela tela;
    Trama trama;
    String colorPrimario;
    String colorSecundario;

        public void tipoPrenda(TipoPrenda tipoPrenda){
            if(tipoPrenda==null){throw new DatoNecesarioException("El tipo de la prenda no puede estar vacio");}
            this.tipoPrenda = tipoPrenda;
        }
        public void cateriaPrenda(CategoriaPrenda categoriaPrenda){
            if(categoriaPrenda==null){throw new DatoNecesarioException("La categoria de la prenda no puede estar vacio");}
            this.categoriaPrenda = categoriaPrenda;
        }
        public void tela(Tela tela){
            if(tela==null){throw new DatoNecesarioException("La tela de la prenda no puede estar vacio");}
            this.tela = tela;
        }
        public void trama(Trama trama){
            if(trama==null){
                this.trama = Trama.LISA;
            }else{
                this.trama = trama;
            }
        }
        public void colorPrimario(String colorPrimario){
            if(colorPrimario==null){throw new DatoNecesarioException("El color primario de la prenda no puede estar vacio");}
            this.colorPrimario = colorPrimario;
        }
        public void colorSecundario(String colorSecundario){
            this.colorPrimario = colorSecundario;
        }

        public Prenda guardarPrenda(){
            if (tipoPrenda.categoriaPrenda != categoriaPrenda) {
                throw new TipoCategoriaNoCoincidenException("El tipo de prenda no coincide con la categoria");
            }
            return new Prenda(tipoPrenda,categoriaPrenda,tela,trama,colorPrimario,colorSecundario);
        }
}
