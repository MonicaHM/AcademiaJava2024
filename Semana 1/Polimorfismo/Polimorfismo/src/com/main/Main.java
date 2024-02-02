package com.main;

import com.game.characters.Character;
import com.game.characters.*;

import java.util.*;

/**
 * Clase principal que demuestra la creación y ejecución de acciones
 * para los personajes del juego.
 */
public class Main {

    /**
     * Método principal que crea instancias de personajes y realiza acciones sobre ellos.
     * Se demuestra tanto el uso de la clase abstracta Character como la interfaz CharacterActions.
     */
    public static void main(String[] args) {
        // Crear y mostrar acciones para personajes utilizando la clase abstracta Character.
        List<Character> characterList = createList(Character.class);
        System.out.println("---------------------------------");
        System.out.println("--------- Tipo Character --------");
        System.out.println("---------------------------------");
        performActions(characterList);

        // Crear y mostrar acciones para personajes utilizando la interfaz CharacterActions.
        List<CharacterActions> characterActionsList = createList(CharacterActions.class);
        System.out.println("---------------------------------");
        System.out.println("-----  Tipo CharacterActions ----");
        System.out.println("---------------------------------");
        performActions(characterActionsList);
    }

    /**
     * Crea una lista de personajes utilizando reflexion y cast().
     *
     * @param <T>        Tipo genérico que representa el tipo de objeto a crear en la lista de personajes.
     * @param objectType Clase que define el tipo de objeto a crear y agregar a la lista characters.
     * @return           La lista de personajes creada de acuerdo al tipo de objeto recibido.
     *
     */
    private static <T> List<T> createList(Class<T> objectType) {
        List<T> characters = new ArrayList<>();
        characters.add(objectType.cast(new Kirby()));
        characters.add(objectType.cast(new MetaKnight()));
        characters.add(objectType.cast(new KingDedede()));
        return characters;
    }

    /**
     * Realiza las acciones para cada personaje en la lista, como saltar, moverse, protegerse, atacar y
     * realizar su habilidad especial.
     *
     * @param characterList Lista de personajes sobre los que se realizaran las acciones.
     *                      Debe de ser una lista que contenga objetos de clases que
     *                      implementen la interfaz CharacterActions.
     */
    private static void performActions(List<? extends CharacterActions> characterList) {
        for (CharacterActions character : characterList) {
            character.jump();
            character.move();
            character.guard();
            character.attack();
            character.specialAbility();
            System.out.println();
        }
    }
}