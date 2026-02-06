public class Weapon {

    private String name;
    private double damage;
    private int durability;

    public Weapon(String name, double damage){
        this.name = name;
        this.damage = damage;
       // this.durability = durability;
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }



    public String toString(){
        return name + " | Damage: " + damage;
        }


}


