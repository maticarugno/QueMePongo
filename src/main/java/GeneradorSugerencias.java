import prendas.Prenda;

import java.util.List;

public interface GeneradorSugerencias {
        public List<Sugerencia> generarSugerenciaDesde(List<Prenda> prendasAptas);
}
