/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_03.problema;

/**
 *
 * @author jacks
 */
public class Cliente {
    public static void main(String[] args) {
        // Configurar una sola vez la instancia compartida
        GameConfig cfg = GameConfig.getInstance();
        cfg.setDatabaseUrl("jdbc:postgresql://prod-db:5432/game");
        cfg.setDebugMode(true);
        cfg.setMaxPlayers(8);

        // Config de red global (enum singleton)
        NetworkConfig net = NetworkConfig.INSTANCE;
        net.setEndpoint("https://net.prod.game.com"); 

        // Uso en las demás clases
        GameSession session = new GameSession();
        NetworkManager netMgr = new NetworkManager();
        DatabaseManager dbMgr = new DatabaseManager();

        session.startSession();
        netMgr.connect();
        dbMgr.saveData();

        // Comprobación de unicidad (opcional)
        System.out.println("cfg hash: " + System.identityHashCode(cfg) + " vs "
                + System.identityHashCode(GameConfig.getInstance()));
        System.out.println("net hash: " + System.identityHashCode(net) + " vs "
                + System.identityHashCode(NetworkConfig.INSTANCE));
    }
}
