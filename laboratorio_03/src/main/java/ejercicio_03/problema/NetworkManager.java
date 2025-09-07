/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03.problema;

/**
 *
 * @author jacks
 */
public class NetworkManager {

    private final GameConfig gameConfig;
    private final NetworkConfig networkConfig;

    public NetworkManager() {
        this.gameConfig = GameConfig.getInstance();
        this.networkConfig = NetworkConfig.INSTANCE;
    }

    public void connect() {
        System.out.println("[NetworkManager] Usando " + networkConfig);
        if (gameConfig.isDebugMode()) {
            System.out.println("[NetworkManager] Modo DEBUG activo");
        }
        System.out.println("Conectando a " + networkConfig.getEndpoint() + " ...");
    }
}
