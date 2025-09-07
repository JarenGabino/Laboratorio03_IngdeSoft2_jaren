/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_02.problema;

/**
 *
 * @author jacks
 */
public class Cliente {

    private static void demo(GameElementFactory factory) {
        Character warrior = factory.createWarrior();
        Weapon sword = factory.createWeapon();

        System.out.println(warrior.getInfo());
        warrior.attack();

        System.out.println(sword.getInfo());
        sword.use();

        System.out.println("-----------------------------------------------");
    }

    public static void main(String[] args) {
        GameElementFactory pcFactory = new PCFactory();
        GameElementFactory mobileFactory = new MobileFactory();

        demo(pcFactory);
        demo(mobileFactory);
    }
}