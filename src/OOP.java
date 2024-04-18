public class OOP {
    public static void main(String[] args) {
        System.out.println("\n\n\t------OOP------");

        Weapon USP = new Weapon("USP", "Piu", 12);
        Weapon M4 = new Weapon("M4", "Bam", 30);
        USP.setParam("USP",14);
        USP.shoot();
    }
}
class Weapon{
    static final String MATERIAL = "Steel"; //создание константы для всех обьектов
    public final String NAME;
    String sound;
    int magazine;

    Weapon(){
        this.NAME = "Оружее";
        this.sound = "";
        this.magazine = 0;
    }

    Weapon(String name, String sound, int magazine){ //parameter overload
        this.NAME = name;
        this.sound = sound;
        this.magazine = magazine;
    }

    void setParam(String sound, int magazine){ //class method
        this.sound = sound;
        this.magazine = magazine;
        // для константы нельзя создать сеттер
    }

    private String getSound(){
        return sound;
    }

    private String getName(){
        return NAME;
    }

    void shoot(){
        System.out.print(sound);
    }

}