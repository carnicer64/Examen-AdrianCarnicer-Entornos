package domain;

public class Carta {
    private String palo;
    private String numero;

    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "palo='" + palo + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

    public Carta() {
    }

    public int getValor(){
        int valor = 0;
        return valor;
    }
}
