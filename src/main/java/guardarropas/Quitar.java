package guardarropas;

import prendas.Prenda;

public class Quitar implements Propuesta{
    Prenda prenda = null;
    Guardarropa guardarropa = null;

    public Quitar(Prenda prenda, Guardarropa guardarropa){
        this.guardarropa = guardarropa;
        this.prenda = prenda;
    }

    @Override
    public void aplicar() {
        this.guardarropa.quitarPrenda(this.prenda);
    }

    @Override
    public void deshacer() {
        this.guardarropa.agregarPrenda(this.prenda);
    }
}
