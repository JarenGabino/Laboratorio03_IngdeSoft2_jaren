package ejercicio_02.problema;

public class MobileWarrior extends Character {

    public MobileWarrior() {
        this.name = "Mobile Warrior";
        this.platform = "Mobile";
    }

    @Override
    public void attack() {
        System.out.println("Mobile Warrior ataca con gestos táctiles.");
    }
}