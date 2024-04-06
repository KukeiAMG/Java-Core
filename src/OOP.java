public class OOP {
    public static void main(String[] args) {
        System.out.println("\n\n\t------OOP------");

        Weapon USP = new Weapon();
        USP.setParam("USP","Piu");
        USP.shoot();
    }
}
class Weapon{
    String name; //
    String Sound;

    Weapon(){ //default constructor
        System.out.println("Введите параметры оружия!");
    }

    Weapon(String name, String sound){ //parameter overload
        this.name = name;
        this.Sound = sound;
    }

    void setParam(String name, String sound){ //class method
        this.name = name;
        this.Sound = sound;
    }

    void shoot(){
        System.out.print(Sound);
    }

}