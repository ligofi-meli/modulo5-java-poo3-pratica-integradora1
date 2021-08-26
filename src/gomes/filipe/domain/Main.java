package gomes.filipe.domain;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Roupa> roupasDaAnna = new ArrayList<>();
        List<Roupa> roupasDoMark = new ArrayList<>();

        roupasDaAnna.add(new Roupa("MariaMaria Modas", "Vestido tamanho 42(M) florido"));
        roupasDaAnna.add(new Roupa("Joanna Moda Feminina", "Calça tamanho 42 preta sarja feminina"));
        roupasDoMark.add(new Roupa("Canary", "Camisa tamanho M branca de manga longa"));
        roupasDoMark.add(new Roupa("Adidas", "Camisa tamanho G do  Bayer de Munique"));


        GuardaRoupa guardaRoupa = new GuardaRoupa();

        System.out.println("--- Roupas da Anna ---");
        System.out.println(roupasDaAnna);

        System.out.println("--- Roupas do Mark ---");
        System.out.println(roupasDoMark);

        guardaRoupa.guardarRoupas(roupasDaAnna);
        guardaRoupa.guardarRoupas(roupasDoMark);

        System.out.println("--- Roupas ---");
        guardaRoupa.mostrarRoupas();

        System.out.println("--- Roupas devolvidas ---");
        System.out.println(guardaRoupa.devolverRoupas(2));

        System.out.println("--- Após ddevolução ---");

        guardaRoupa.mostrarRoupas();

    }
}
