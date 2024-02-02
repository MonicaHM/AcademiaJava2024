package com.game.characters;

/**
 * Clase que representa al personaje "Meta Knight" en el juego, hereda de la clase base Character.
 * La clase MetaKnight proporciona una implementación específica para la habilidad especial
 * del personaje, que consisten en movimientos individuales del personaje.
 */
public class MetaKnight extends Character {

    /**
     * Implementación del método abstracto specialAbility() de la clase base Character.
     * Realiza la habilidad especial única de Meta Knight: supertornado.
     */
    @Override
    public void specialAbility() {
        // Imprime un mensaje indicando que la clase MetaKnight realiza su habilidad especial.
        System.out.println(getNombre() + " realiza supertornado!");
    }
}