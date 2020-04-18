package tiposDePrendas;

import categoriasDePrendas.CategoriaPrenda;

public enum TipoPrenda {
    ZAPATO{
        public CategoriaPrenda categoria(){
            return CategoriaPrenda.CALZADO;
        }
    },
    REMERA{
        public CategoriaPrenda categoria(){
            return CategoriaPrenda.SUPERIOR;
        }
    },
    CAMISA{
        public CategoriaPrenda categoria(){
            return CategoriaPrenda.SUPERIOR;
        }
    },
    PANTALON{
        public CategoriaPrenda categoria(){
            return CategoriaPrenda.INFERIOR;
        }
    },
    GORRA{
        public CategoriaPrenda categoria(){
            return CategoriaPrenda.ACCESORIO;
        }
    };
    public abstract CategoriaPrenda categoria();
}
