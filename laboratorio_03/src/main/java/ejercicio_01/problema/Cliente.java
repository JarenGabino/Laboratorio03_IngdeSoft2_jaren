/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_01.problema;

/**
 *
 * @author jacks
 */
public class Cliente {
    public static void main(String[] args) {
        GameFactory rpgFactory = new RPGFactory();
        GameFactory fpsFactory = new FPSFactory();
        GameFactory puzzleFactory = new PuzzleFactory();

        rpgFactory.playGame();
        fpsFactory.playGame();
        puzzleFactory.playGame();
    }
}
