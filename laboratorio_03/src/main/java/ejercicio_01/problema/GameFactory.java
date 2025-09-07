package ejercicio_01.problema;

public abstract class GameFactory {

    // Factory Method: cada subclase decide qué Game construir
    public abstract Game createGame();

    // Operación que usa el producto creado
    public void playGame() {
        Game game = createGame();
        System.out.println(game.getInfo());
        game.start();
        System.out.println("--------------------------------------------");
    }
}
