import java.util.Arrays;

public class Character {
    private String name;
    private int healthPoints;
    private int maxHealth;
    private int level;
    private int experiencePoints;
    private double gold;
    private boolean isAlive;
    private char type;
    //private String[] inventory;


    public Character(String name, char type, int healthPoints, int maxHealth, int level, int experiencePoints, double gold, boolean isAlive){
        this.name = name;
        this.type = type;
        this.healthPoints = healthPoints;
        this.maxHealth = maxHealth;
        this.level = level;
        this.experiencePoints = experiencePoints;
        this.gold = gold;
        this.isAlive = isAlive;
        //this.inventory = inventory;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public double getGold() {
        return gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

   /* public String[] getInventory() {
        return inventory;
    }

    public void setInventory(String[] inventory) {
        this.inventory = inventory;
    }*/


    //iteration 2 kontrol structures
    public void health(){
        if (healthPoints < 25){
            System.out.println("WARNING: Health critical!!!");
        } else {
            System.out.println(getName() + " is still alive and well!\n");
        }

    }


    public void damage(int damage){
       int currentHealth = healthPoints;
        if (healthPoints >= 0){
            healthPoints -= damage;
            System.out.println(getName() + " took "+ damage+ " damage!!");
            System.out.println("Health went from: "+ currentHealth +" to "+ healthPoints);
        }

    }

    public void levelUp(){
        int currentLevel = level;
        int threshold = 1000 * currentLevel;
        if (experiencePoints > threshold){
            System.out.println("Ready to level up!");
        } else {
            System.out.println("Still at level: "+ currentLevel);
        }

    }

    //Udskriv forskellige beskeder baseret på klasse (‘W’, ‘M’, ‘R’)
    public void charType(){

    }







    public String toString(){
        return "Character name: "+name +"\nType (Warrior, Mage, Rogue): "+ type
                +"\nHP: "+ healthPoints +"\nMax HP: "+ maxHealth
                +"\nLevel: "+ level + "\nXP: "+ experiencePoints + "\nGold: "+gold
                + "\n" +getName() + " is alive: "+ isAlive;
                //+"\nInventory: "+ inventory; // inventory ikk visible uden toString metoden
    }


}
