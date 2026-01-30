
public class Character {
    private String name;
    private int healthPoints;
    private int maxHealth;
    private int level;
    private int experiencePoints;
    private double gold;
    //private boolean isAlive;
    private char type;
    //private String[] inventory;


    public Character(String name, char type, int healthPoints, int maxHealth, int level, int experiencePoints, double gold) {
        this.name = name;
        this.type = type;
        this.healthPoints = healthPoints;
        this.maxHealth = maxHealth;
        this.level = level;
        this.experiencePoints = experiencePoints;
        this.gold = gold;
        //this.isAlive = isAlive;
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

    /*public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }*/

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
    public void charType() {
        if (this.type == 'W') {
            System.out.println("Warrior - brave, strong and resilient!");
        } else if (this.type == 'M') {
            System.out.println("Mage - slick and smart with magical powers!");
        } else if (this.type == 'R') {
            System.out.println("Rogue - Risk taking assassin with fast combat!");
        }
    }

    // Returnerer true hvis health > 0

    // Returnerer true hvis health < 25%
    public boolean health() {
        if (healthPoints < 25) {
            System.out.println("WARNING: Health critical!!!");
        } else {
            System.out.println(getName() + " is still alive and well!\n");
        }

        return false;
    }


    public void damage(int damage) {
        int currentHealth = healthPoints;
        if (healthPoints >= 0) {
            healthPoints -= damage;
            System.out.println(getName() + " took " + damage + " damage!!");
            System.out.println("Health went from: " + currentHealth + " to " + healthPoints);
        }

    }

    //TODO: Øge level, nulstille XP, øge maxHealth
    public void levelUp() {
        int currentLevel = level;
        int threshold = 1000 * currentLevel;
        if (experiencePoints > threshold) {
            System.out.println("Ready to level up!");
        } else {
            System.out.println("Still at level: " + currentLevel);
        }

    }


    // Lav iteration 3 - metoder:
    public void printCharacterSheet() {
        System.out.println("Character name: "+name +"\nType (Warrior, Mage, Rogue): "+ type
                +"\nHP: "+ healthPoints +"\nMax HP: "+ maxHealth
                +"\nLevel: "+ level + "\nXP: "+ experiencePoints + "\nGold: "+gold);

        if (this.type == 'W') {
            System.out.println("Warrior - brave, strong and resilient!");
        } else if (this.type == 'M') {
            System.out.println("Mage - slick and smart with magical powers!");
        } else if (this.type == 'R') {
            System.out.println("Rogue - Risk taking assassin with fast combat!");
        }
    }

    public void heal(int amount) {
        int heals = healthPoints;
        if (healthPoints >= 0) {
            healthPoints += amount;
            System.out.println(getName() + " healed with " + amount + " HP!!");
            System.out.println("Health went from: " + heals + " to " + healthPoints);
        }
    }

    public void addGold(double amount){
        double goldCoins = gold;
        gold += amount;
        System.out.println(goldCoins +" gold added!"+ "\nNew amount is: "+gold);
    }

    public boolean removeGold(double amount){
        gold -= amount;
        if (gold >= 0){
            System.out.println(amount+ " gold removed.."+ "\nNew gold amount: "+ gold);
            return true;
        }
        System.out.println("Cannot remove gold!!");
        return false;
    }

    public void addXP(int amount){
        experiencePoints += amount;
        int newXP = experiencePoints;
        System.out.println("\nXP added: "+ amount+ "\nNew XP level: "+ newXP);

    }

    public double getHealthPercentage(){
       return (double) maxHealth / healthPoints * 100;

    }

    public void printInventory() {
        String[] inventory = new String[]{"Ax", "Knife", "Slurp splash", "Sprunk"};
        System.out.println("\nInventory (" + inventory.length + " items)");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(inventory[i]);
        }
    }


    public String toString(){
        return name + type + healthPoints + maxHealth + level + experiencePoints +gold;
                //+ "\n" +getName() + " is alive: "+ isAlive;
                //+"\nInventory: "+ inventory; // inventory ikk visible uden toString metoden
    }


}
