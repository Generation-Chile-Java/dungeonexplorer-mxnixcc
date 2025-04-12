package Java;

import Java.Habitaciones.*;
import Java.Objetos.Enemigo;
import Java.Objetos.Jugador;
import Java.Objetos.Tesoros;

import java.util.Scanner;

public class DungeonGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Para leer input del jugador

        System.out.println("Despiertas desorientado en el interior de la arena. Los juegos han empezado y solo uno de ustedes podrá sobrevivir...");
        System.out.println("Que la suerte esté siempre de tu lado.");
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        Jugador player = new Jugador(nombre, 100);  // Se crea el jugador con 100 de vida

        // Se crea una mazmorra con niveles, cada uno con dos caminos
        NivelesHabitacion[] dungeon = new NivelesHabitacion[] {
                new NivelesHabitacion(new HabitacionVacia(), new HabitacionDelTesoro(new Tesoros()), new HabitacionDelTesoro(new Tesoros())),
                new NivelesHabitacion(new HabitacionConElEnemigo(new Enemigo(20)), new HabitacionDelTesoro(new Tesoros()), new HabitacionDelTesoro(new Tesoros())),
                new NivelesHabitacion(new HabitacionConElEnemigo(new Enemigo(30)), new HabitacionVacia(), new HabitacionDelTesoro(new Tesoros())),
                new NivelesHabitacion(new HabitacionConElEnemigo(new Enemigo(30)), new HabitacionVacia(), new HabitacionDelTesoro(new Tesoros())),
                new NivelesHabitacion(new HabitacionVacia(),new HabitacionDescanso(), new HabitacionDelTesoro(new Tesoros()))
        };


        // Se recorre cada nivel de la mazmorra
        for (int i = 0; i < dungeon.length; i++) {
            System.out.println("\n--- Nivel " + (i + 1) + " ---");
            dungeon[i].choosePath(player, scanner);  // El jugador elige un camino

            // Si el jugador muere, termina el juego
            if (!player.isAlive()) {
                System.out.println("¡Oh, no!" + nombre + ". Fin de los juegos, la suerte no estuvo de tu lado.");
                return;
            }

            boolean nextLevel = false;
            while (!nextLevel) {
                System.out.println("--- MENÚ ---");
                System.out.println("Hola, " + nombre +". Este es tu menú, ¿Qué decisión vas a tomar?");

                System.out.println("1. Ver estado");
                System.out.println("2. Continuar al siguiente nivel");


                String input = scanner.nextLine();

                switch (input) {
                    case "1":
                        player.showStatus(); // muestra los puntos de vida y el inventario con los objetos del tesoro
                        break;
                    case "2":
                        nextLevel = true; // rompe el bucle para avanzar
                        break;
                    default:
                        System.out.println("Opción inválida. Vuelve a intentarlo.");
                }
            }

        }

        // Si el jugador sobrevive a todos los niveles
        System.out.println("Felicidades " + nombre + ", has explorado todos los niveles!");
        player.showStatus();  // Estado final del jugador
        System.out.println("The end...?");
    }
}
