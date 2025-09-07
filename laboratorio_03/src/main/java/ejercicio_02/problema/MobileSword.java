package ejercicio_02.problema;

public class MobileSword extends Weapon {

    public MobileSword() {
        this.name = "Mobile Sword";
        this.platform = "Mobile";
    }

    @Override
    public void use() {
        System.out.println("Mobile Sword usada con tap y swipe.");
    }
}
