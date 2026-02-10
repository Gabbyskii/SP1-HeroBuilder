import java.util.Arrays;

    public static void main(String[] args) {
        // Iteration 4 - objects (allerede oprettet):
        // opretter første karakyer obj
        Character warrior1 = new Character("Ragnar", 'W',
                85, 100, 5, 2300,
                156.50, new String[]{"Ax", "Knife", "Slurp splash", "Sprunk"});

        Character rogue2 = new Character("Voldemort", 'R',
                95, 100, 7, 2200,
                100, new String[]{"Bow", "Dagger", "Slurp splash", "Shield"});

        System.out.println("===CHARACTERS STATUS===");
        warrior1.printCharacterSheet();
        //warrior1.printInventory();

        rogue2.printCharacterSheet();
        //rogue2.printInventory();

        System.out.println("\n===COMBAT===");
        warrior1.attack(rogue2);
        rogue2.attack(warrior1);
        System.out.println();
        //warrior1.heal(35);
        //warrior1.addXP(600);
        //warrior1.removeGold(50);
        //warrior1.levelUp();

        System.out.println("===HEALTH STATUS===");
        System.out.println(rogue2.getName() + "'s health: " + rogue2.getHealthPercentage() + "%");

        if (warrior1.isHealthCritical()) {
            System.out.println("CRITICAL!!!");
        } else {
            warrior1.isAlive();
        }

        /*if (warrior1.removeGold(100.0)) {
            System.out.println("Bought a potion!");
        } else {
            System.out.println("Not enough gold!");
        }*/


       /*System.out.println("\n===STATUS===");
        //warrior1.levelUp();
        warrior1.addXP(600);
        warrior1.addGold(100);*/



}


