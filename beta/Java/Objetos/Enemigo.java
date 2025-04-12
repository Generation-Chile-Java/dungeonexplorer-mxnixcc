package Java.Objetos;

import Interfaz.GameObject;

// Un enemigo que hace daño al jugador
public class Enemigo implements GameObject {
    private int damage;

    public Enemigo(int damage) {
        this.damage = damage;
    }

    @Override
    public void interact(Jugador player) {
        player.Damage(damage); // Resta vida al jugador
    }

    @Override
    public String toString() {
        return "Un muto te ha atacado, (daño: " + damage + ")";
    }
}
