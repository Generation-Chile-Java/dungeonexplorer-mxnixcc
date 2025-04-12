package Java.Objetos;

import Interfaz.GameObject;
import Java.Objetos.Jugador;

public class Tesoros implements GameObject {
    @Override
    public void interact(Jugador player) {
        player.addToInventaio(this); // Se guarda el objeto encontrado en el inventario
    }

    @Override
    public String toString() {
        return "Tesoro";
    }
}
