package com.game.characters;

/**
 * Interfaz CharacterActions que define un conjunto de métodos representando acciones
 * comunes que un personaje de un juego puede llevar a cabo.
 * Esta interfaz proporciona una abstracción para las acciones básicas de un personaje en un juego,
 * incluyendo saltar, moverse, protegerse, atacar y habilidades especiales.
 */
public interface CharacterActions {
    void jump();
    void move();
    void guard();
    void attack();
    void specialAbility();
}