package com.game.config;

import static com.game.util.Constants.*;

/**
 * Implementación del patrón Singleton para gestionar y almacenar
 * la configuración de un juego, incluyendo calidad gráfica, resolución,
 * volumen de sonido y configuraciones de idioma.
 */
public class Settings {

    // Instancia Singleton.
    private static Settings settings;

    // Atributos de Configuración de Gráficos.
    private String graphicSettingsGraphicsQuality;
    private String graphicSettingsResolution;
    private int graphicSettingsFPS;

    // Atributos de Configuración de Sonido.
    private int soundSettingsMasterVolume;

    // Atributos de Configuración de Idioma.
    private String languageSettingsText;
    private String languageSettingsVoice;

    /**
     * Constructor privado para asegurar que ninguna clase externa
     * pueda instanciar Settings directamente.
     * Inicializa las configuraciones predeterminadas para gráficos,
     * sonido e idioma.
     */
    private Settings() {
        initializeSettings();
    }

    /**
     * Obtiene la instancia Singleton de Settings. Si no existe, crea
     * una nueva instancia.
     *
     * @return La instancia Singleton de Settings.
     */
    public static Settings getSettings() {
        if (settings == null)
            settings = new Settings();
        return settings;
    }

    /**
     * Devuelve una representación en formato String de la configuración actual.
     *
     * @return La cadena que representa la configuración actual de Settings.
     */
    @Override
    public String toString() {
        return "Settings {" + '\n' +
                "graphicSettingsGraphicsQuality = " + graphicSettingsGraphicsQuality + '\n' +
                "graphicSettingsResolution = " + graphicSettingsResolution + '\n' +
                "graphicSettingsFPS = " + graphicSettingsFPS + '\n' +
                "soundSettingsMasterVolume = " + soundSettingsMasterVolume + '\n' +
                "languageSettingsText = " + languageSettingsText + '\n' +
                "languageSettingsVoice = " + languageSettingsVoice + '\n' +
                '}';
    }

    // Getters y Setters para las configuraciones de gráficos, sonido e idioma.
    public String getGraphicSettingsGraphicsQuality() {
        return graphicSettingsGraphicsQuality;
    }

    public void setGraphicSettingsGraphicsQuality(String graphicSettingsGraphicsQuality) {
        this.graphicSettingsGraphicsQuality = graphicSettingsGraphicsQuality;
    }

    public String getGraphicSettingsResolution() {
        return graphicSettingsResolution;
    }

    public void setGraphicSettingsResolution(String graphicSettingsResolution) {
        this.graphicSettingsResolution = graphicSettingsResolution;
    }

    public int getGraphicSettingsFPS() {
        return graphicSettingsFPS;
    }

    public void setGraphicSettingsFPS(int graphicSettingsFPS) {
        this.graphicSettingsFPS = graphicSettingsFPS;
    }

    public int getSoundSettingsMasterVolume() {
        return soundSettingsMasterVolume;
    }

    public void setSoundSettingsMasterVolume(int soundSettingsMasterVolume) {
        this.soundSettingsMasterVolume = soundSettingsMasterVolume;
    }

    public String getLanguageSettingsText() {
        return languageSettingsText;
    }

    public void setLanguageSettingsText(String languageSettingsText) {
        this.languageSettingsText = languageSettingsText;
    }

    public String getLanguageSettingsVoice() {
        return languageSettingsVoice;
    }

    public void setLanguageSettingsVoice(String languageSettingsVoice) {
        this.languageSettingsVoice = languageSettingsVoice;
    }

    /**
     * Inicializa las configuraciones predeterminadas para gráficos,
     * sonido e idioma.
     */
    private void initializeSettings() {
        setGraphicsDefaultQuality();
        initializeDefaultSoundSettings();
        initializeDefaultLanguageSettings();
    }

    /**
     * Establece la calidad gráfica, resolución y FPS predeterminados.
     */
    private void setGraphicsDefaultQuality() {
        setGraphicSettingsGraphicsQuality(QUALITY_MEDIUM);
        setGraphicSettingsResolution(QUALITY_MEDIUM);
        setGraphicSettingsFPS(FPS_30);
    }

    /**
     * Establece la configuración predeterminada de sonido.
     */
    private void initializeDefaultSoundSettings() {
        setSoundSettingsMasterVolume(10);
    }

    /**
     * Establece la configuración predeterminada de idioma para texto
     * y voz.
     */
    private void initializeDefaultLanguageSettings() {
        setLanguageSettingsText(LANGUAGE_ENGLISH);
        setLanguageSettingsVoice(LANGUAGE_ENGLISH);
    }
}