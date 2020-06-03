package guardarropas;

import prendas.Prenda;

public class Agregar implements  Propuesta{
    Prenda prenda = null;
    Guardarropa guardarropa = null;

    public Agregar(Prenda prenda, Guardarropa guardarropa){
        this.guardarropa = guardarropa;
        this.prenda = prenda;
    }

    @Override
    public void aplicar() {
        this.guardarropa.agregarPrenda(this.prenda);
    }

    @Override
    public void deshacer() {
        this.guardarropa.quitarPrenda(this.prenda);
    }
}
