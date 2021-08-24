package gomes.filipe.domain;

public class Main {
    public static void main(String[] args) {
        GuardaRoupa guardaRoupa = new GuardaRoupa();

        guardaRoupa.cliente.put(1, new Roupa("Adidas", "Camisa tamanho G do  Bayer de Munique"));
        guardaRoupa.cliente.put(2, new Roupa("Reserva", "Camisa tamanho M branca de manga longa"));
        guardaRoupa.cliente.put(3, new Roupa("Riachuelo", "Calça tamanho 44 preta sarja masculina"));
        guardaRoupa.cliente.put(4, new Roupa("Marisa", "Vestido tamanho 42(M) florido"));

        int procuraCliente = 3;

        if (guardaRoupa.cliente.containsKey(procuraCliente)) {
            System.out.println("Código do cliente " + procuraCliente + ": " + guardaRoupa.cliente.get(procuraCliente));
        } else {
            System.out.println("Cliente não encontrado");
        }
    }
}
