package domain;

import java.util.ArrayList;
import java.util.HashMap;

public class Partida {

    private String nombre;
    private ArrayList<Jugador> listaJugadores = new ArrayList<>();
    private Baraja bajara = new Baraja();
    private HashMap<String,Integer> puntuacionJugadores;

    public Partida(String nombre) {
        this.nombre = nombre;
    }

    public void addJugador(Jugador jugador) {

    }

    public void jugarPartida(int turnos) {

    }

    public void jugarRonda() {

    }

    public void comprobarGanadorRonda() {

    }

    public void comprobarGanadorPartida() {

    }

}
