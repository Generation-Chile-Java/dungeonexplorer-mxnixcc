package Java.Objetos;

    import Interfaz.GameObject;

    import java.util.ArrayList;
import java.util.List;

    public class Jugador {
        // Atributos encapsulados (privados)
        private String name;
        private int vida;
        private List<GameObject> inventario; // Lista de objetos recogidos

        // Constructor del jugador
        public Jugador(String name, int vida) {
            this.name = name;
            this.vida = vida;
            this.inventario = new ArrayList<>();
        }

        // El jugador recibe daño
        public void Damage(int damage) {
            this.vida -= damage;
            System.out.println(name + " ha recibido " + damage + " puntos de daño.");
        }

        // El jugador recoge un objeto
        public void addToInventaio(Tesoros item) {
            inventario.add(item);
            System.out.println(name + " ha recogido un objeto: " + item.getClass().getSimpleName());
        }


        // Verifica si el jugador sigue vivo
        public boolean isAlive() {
            return vida > 0;
        }

        // Muestra el estado actual del jugador
        public void showStatus() {
            System.out.println("\nJugador: " + name + " | Vida: " + vida+ " | Inventario: " + inventario.size() + " objetos\n");
        }


}
