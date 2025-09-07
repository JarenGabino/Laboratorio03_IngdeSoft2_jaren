/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03.problema;

/**
 *
 * @author jacks
 */
public class GameConfig {

    private static volatile GameConfig instance; // visibilidad entre hilos

    private String databaseUrl = "jdbc:mysql://localhost:3306/game_db";
    private boolean debugMode = false;
    private int maxPlayers = 4;

    private GameConfig() { }

    public static GameConfig getInstance() {
        if (instance == null) {
            synchronized (GameConfig.class) {
                if (instance == null) {
                    instance = new GameConfig();
                }
            }
        }
        return instance;
    }

    public String getDatabaseUrl() { return databaseUrl; }
    public void setDatabaseUrl(String databaseUrl) { this.databaseUrl = databaseUrl; }

    public boolean isDebugMode() { return debugMode; }
    public void setDebugMode(boolean debugMode) { this.debugMode = debugMode; }

    public int getMaxPlayers() { return maxPlayers; }
    public void setMaxPlayers(int maxPlayers) { this.maxPlayers = maxPlayers; }

    @Override
    public String toString() {
        return "GameConfig{databaseUrl='" + databaseUrl + "', debugMode=" + debugMode +
               ", maxPlayers=" + maxPlayers + "}";
    }
}
