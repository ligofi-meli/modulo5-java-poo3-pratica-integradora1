package gomes.filipe.domain;

import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {
    HashMap<Integer, List<Roupa>> gavetas = new HashMap<>();
    private int i = 0;

    public int guardarRoupas(List<Roupa> listaRoupas) {
        gavetas.put(++i, listaRoupas);
        return i;
    }

    public List<Roupa> devolverRoupas(int id) {
        List<Roupa> listaDeRoupas = gavetas.get(id);
        gavetas.remove(id);
        return listaDeRoupas;
    }

    public void mostrarRoupas() {
        for (Integer id: gavetas.keySet()) {
            List<Roupa> listaRoupas = gavetas.get(id);
            for (Roupa roupa: listaRoupas) {
                System.out.println(roupa.toString());
            }
        }
    }
}
