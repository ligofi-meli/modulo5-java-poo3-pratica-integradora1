package gomes.filipe.domain;

public class Roupa {
    String marca, modelo;

    public Roupa(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
