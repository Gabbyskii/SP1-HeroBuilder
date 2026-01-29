public class Character {
    String name;
    int healthPoints;
    int maxHealth;
    int level;
    int experiencePoints;
    double gold;
    boolean isAlive;
    char type;
    String[] inventory; // = new String[8] inventory limit mby?


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

    public String[] getInventory() {
        return inventory;
    }

    public void setInventory(String[] inventory) {
        this.inventory = inventory;
    }



    public Character(String name, int healthPoints, int maxHealth, int level, int experiencePoints, double gold, boolean isAlive, char type, String[] inventory){
        this.name = name;
        this.healthPoints = healthPoints;
        this.maxHealth = maxHealth;
        this.level = level;
        this.experiencePoints = experiencePoints;
        this.gold = gold;
        this.isAlive = isAlive;
        this.type = type;
        this.inventory = inventory;


    }

    public String toString(){
        return "Character name: "+name +"\nHP: "+ healthPoints +"\nMax HP: "+ maxHealth
                +"\nLevel: "+ level + "\nXP: "+ experiencePoints + "\nGold: "+gold
                + "\nCharacter alive: "+ isAlive + "\nType (Warrior, Mage, Rogue): "+ type
                +"\nInventory: "+ inventory;
    }


}
