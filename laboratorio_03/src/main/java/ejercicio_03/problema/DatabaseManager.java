package ejercicio_03.problema;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jacks
 */
public class DatabaseManager {

    private final GameConfig config;

    public DatabaseManager() {
        this.config = GameConfig.getInstance();
    }

    public void saveData() {
        System.out.println("[DatabaseManager] Usando " + config);
        System.out.println("Guardando datos en " + config.getDatabaseUrl() + " ...");
    }
}
