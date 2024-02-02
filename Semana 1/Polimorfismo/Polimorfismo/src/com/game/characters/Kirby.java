package com.game.characters;

/**
 * Clase que representa al personaje "Kirby" en el juego, hereda de la clase base Character.
 * La clase Kirby proporciona una implementación específica para la habilidad especial
 * del personaje, que consiste en movimientos individuales del personaje.
 */
public class Kirby extends Character {

    /**
     * Implementación del método abstracto specialAbility() de la clase base Character.
     * Realiza la habilidad especial única de Kirby: caída veloz.
     */
    @Override
    public void specialAbility() {
        // Imprime un mensaje indicando que la clase Kirby realiza su habilidad especial.
        System.out.println(getNombre() + " realiza caída veloz!");
    }
}