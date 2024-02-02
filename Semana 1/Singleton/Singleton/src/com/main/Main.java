package com.main;

import com.game.config.Settings;

/**
 * Clase principal que demuestra el patrón de diseño Singleton.
 */
public class Main {

    public static void main(String[] args) {
        // Obtener instancias de Settings utilizando el método estático getSettings()
        Settings settings1 = Settings.getSettings();
        Settings settings2 = Settings.getSettings();

        // Verificar si solo existe una instancia.
        // Las referencias apuntan al mismo objeto en memoria.
        if (settings1 == settings2)
            System.out.println("Solo hay una instancia de Settings.\n");
        else
            System.out.println("Error: Se han creado múltiples instancias de Settings.\n");

        // Verificar que se configuró adecuadamente.
        System.out.println(settings1);
    }
}
