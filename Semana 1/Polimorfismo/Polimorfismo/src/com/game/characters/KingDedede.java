package com.game.characters;

/**
 * Clase que representa al personaje "King Dedede" en el juego, hereda de la clase base Character.
 * La clase MetaKnight proporciona una implementación específica para la habilidad especial
 * del personaje, que consisten en movimientos individuales del personaje.
 */
public class KingDedede extends Character {

    /**
     * Implementación del método abstracto specialAbility() de la clase base Character.
     * Realiza la habilidad especial única de King Dedede: martillo ígneo.
     */
    @Override
    public void specialAbility() {
        // Imprime un mensaje indicando que la clase KingDedede realiza su habilidad especial.
        System.out.println(getNombre() + " hace martillo ígneo!");
    }
}