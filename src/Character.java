
public class Character {
    private String name;
    private int healthPoints;
    private int maxHealth;
    private int level;
    private int experiencePoints;
    private double gold;
    private char type;
    private String[] inventory;


    public Character(String name, char type, int healthPoints, int maxHealth, int level, int experiencePoints, double gold, String[] inventory) {
        this.name = name;
        this.type = type;
        this.healthPoints = healthPoints;
        this.maxHealth = maxHealth;
        this.level = level;
        this.experiencePoints = experiencePoints;
        this.gold = gold;
        this.inventory = inventory;

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



    public boolean isHealthCritical() {
        if (healthPoints < 25) {
            System.out.println("WARNING: Health critical!!!");
            return true;
        }
        return false;
    }

    public boolean isAlive() {
        if (healthPoints > 0) {
        System.out.println(getName() + " is still alive and well!");
        return true;
        }
        return false;
    }

    public void heal(int amount) {
        int heals = healthPoints;
        if (healthPoints >= 0) {
            healthPoints += amount;
            System.out.println(getName() + " healed with " + amount + " HP!!"+
                    " | Health: " + heals + " --> " + healthPoints);
        }
    }

    //iteration 4: attack method erstattet af min damage metode
    public void attack(Character target) {
        int damage = 5 * level + 10;
       // int updateHP = healthPoints - damage;
        System.out.println(name + " attacks " + target.getName() + " for " + damage + " damage!");
                //+ " | HP updated: " + updateHP);

    }

    public double getHealthPercentage(){
        double healthPercent = (double) healthPoints / maxHealth * 100;
        System.out.println(getName() + "'s health: " + healthPercent + "%");

        return healthPercent;
    }


    public void levelUp() {
        int threshold = 100 * level;
        if (experiencePoints >= threshold) {
            int previousLevel = level;
            level++;
            experiencePoints = 0;
            maxHealth += 10;
            healthPoints = maxHealth;
            System.out.println(name + " levelled up from " + previousLevel + " --> " + level +
                    " | New max HP: " + maxHealth);
        }
    }


    public void addXP(int amount){
        experiencePoints += amount;
        int newXP = experiencePoints;
        System.out.println(getName() +": XP gained: +"+ amount+ " | New total XP: "+ newXP);

    }

    public void addGold(double amount){
        double goldCoins = amount;
        gold += amount;
        System.out.println(getName() +": +"+goldCoins +" gold added!"+ " | New amount is: "+gold);
    }

    public boolean removeGold(double amount){
        gold -= amount;
        if (gold >= 0){
            System.out.println("Gold removed from "+getName() +
                    ": -"+amount+ " | New gold amount: "+ gold);
            return true;
        }
        System.out.println("Cannot remove gold!!");
        return false;
    }


    // Lav iteration 3 - metoder:
    public void printCharacterSheet() {
        String typeName = "";
        switch (type){
            case 'W':
               typeName = "Warrior";
                System.out.println("\nWarrior - Brave, strong and resilient!");
               break;
            case 'R':
                typeName = "Rogue";
                System.out.println("\nRogue - Risk taking assassin with fast combat!");
                break;
            case 'M':
                typeName = "Mage";
                System.out.println("\nMage - Slick and smart with magical powers!");
                break;
        }
        System.out.println("Character: "+name + " ("+ typeName + ") "+
                "\n| Level: " + level + " | HP: "+ healthPoints+ "/"+ maxHealth+ " | Gold: " + gold);
    }



    public void printInventory() {
        System.out.println("\nInventory (" + inventory.length + " items)");
        System.out.println(getName()+"'s: ");
        for (String inv: inventory) {
            System.out.println(inv);
        }

    }


    public String toString(){
        return name + type + healthPoints + maxHealth + level
                + experiencePoints + gold + inventory;
    }


}

