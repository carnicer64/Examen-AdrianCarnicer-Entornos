package domain;

import java.util.ArrayList;

public class Baraja {

    ArrayList<Carta> listaCartas = new ArrayList<>();
    private int NUM_CARTAS = 52;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> listaCartas, int NUM_CARTAS) {
        this.listaCartas = listaCartas;
        this.NUM_CARTAS = NUM_CARTAS;
    }

    public void barajar(){

    }

    public Carta cogerCarta(){
        Carta carta = new Carta();
        return carta;
    }

    public ArrayList<Carta> repartirMano() {
        ArrayList<Carta> cartas = new ArrayList<>();
        return cartas;
    }
}
