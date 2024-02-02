package com.game.characters;

/**
 * Clase abstracta que representa un personaje en un juego e implementa la interfaz CharacterActions.
 * La clase proporciona una implementación base para las acciones de un personaje,
 * como saltar, moverse, protegerse, atacar y habilidad especial.
 */
public abstract class Character implements CharacterActions {
    // Atributo para almacenar el nombre del personaje.
    String nombre;

    /**
     * Constructor de la clase Character.
     * Inicializa el nombre del personaje con el nombre de la clase.
     */
    public Character() {
        // Inicializa el nombre del personaje con el nombre de la clase.
        this.nombre = getClass().getSimpleName();
    }

    /**
     * Obtiene el nombre del personaje.
     * @return Cadena que contiene el nombre del personaje.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Implementación del método jump() de la interfaz CharacterActions.
     * Imprime un mensaje indicando que el personaje ha saltado.
     */
    @Override
    public void jump() {
        System.out.println(nombre + " salta");
    }

    /**
     * Implementación del método mover() de la interfaz CharacterActions.
     * Imprime un mensaje indicando que el personaje se ha movido.
     */
    @Override
    public void move() {
        System.out.println(nombre + " se mueve");
    }

    /**
     * Implementación del método guard() de la interfaz CharacterActions.
     * Imprime un mensaje indicando que el personaje se ha protegido.
     */
    @Override
    public void guard() {
        System.out.println(nombre + " se protege");
    }

    /**
     * Implementación del método attack() de la interfaz CharacterActions.
     * Imprime un mensaje indicando que el personaje ha atacado.
     */
    @Override
    public  void attack() {
        System.out.println(nombre + " ataca");
    }

    /**
     * Método abstracto specialAbility()
     * Debe ser implementado por las subclases para representar la habilidad
     * especial del personaje.
     */
    @Override
    public abstract void specialAbility();
}