import java.util.Arrays;

    public static void main(String[] args) {
        // Iteration 4 - objects (allerede oprettet):
        // opretter første karakyer obj
        Character warrior1 = new Character("Ragnar", 'W',
                85, 100, 5, 2300,
                156.50, new String[]{"Ax", "Knife", "Shield", "Sprunk"});

        Character rogue2 = new Character("Voldemort", 'R',
                75, 100, 3, 2000,
                150, new String[]{"Bow", "Dagger", "Shield", "Potion"});

        System.out.println("===CHARACTERS STATS===");
        warrior1.printCharacterSheet();
        //warrior1.printInventory();

        rogue2.printCharacterSheet();
        //rogue2.printInventory();

        System.out.println("\n===COMBAT===");
        warrior1.attack(rogue2);
        rogue2.attack(warrior1);


        System.out.println("\n===HEALTH STATUS===");
        warrior1.getHealthPercentage();
        rogue2.getHealthPercentage();

       /* if (warrior1.isHealthCritical()) {
            System.out.println("CRITICAL!!!");
        } else {
            warrior1.isAlive();
        }*/


       System.out.println("\n===UPDATES===");
        warrior1.levelUp();
        warrior1.addXP(1000);
        warrior1.addGold(100);

        /*if (warrior1.removeGold(50)) {
            System.out.println("Bought a potion!");
        } else {
            System.out.println("Not enough gold!");
        }*/

        warrior1.printCharacterSheet(); //updated char sheet






}


