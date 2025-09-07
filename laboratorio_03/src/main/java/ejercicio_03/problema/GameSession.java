/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03.problema;

/**
 *
 * @author jacks
 */
public class GameSession {

    private final GameConfig config;

    public GameSession() {
        this.config = GameConfig.getInstance();
    }

    public void startSession() {
        System.out.println("[GameSession] Config actual: " + config);
        System.out.println("Iniciando sesión con maxPlayers=" + config.getMaxPlayers() + " ...");
    }
}
