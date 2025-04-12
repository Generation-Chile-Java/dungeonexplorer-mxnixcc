package Interfaz;

import Java.Objetos.Jugador;

public interface GameObject {
    // Acá son válidos tanto enemigos como los tesoros

        void interact(Jugador player); // Cada objeto define cómo interactúa con el jugador


}
