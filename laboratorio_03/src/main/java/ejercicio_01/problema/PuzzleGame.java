package ejercicio_01.problema;

public class PuzzleGame extends Game {

    public PuzzleGame() {
        this.name = "Brain Blocks";
        this.genre = "Puzzle";
    }

    @Override
    public void start() {
        System.out.println("Iniciando Puzzle... resuelve acertijos por niveles.");
    }
}
