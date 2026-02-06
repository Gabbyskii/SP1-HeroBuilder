import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Iteration 4 - objects (allerede oprettet):
        // opretter første karakyer obj
        Character warrior1 = new Character("Ragnar", 'W',
                85, 100,5, 2300,
                156.50, new String[]{"Ax", "Knife", "Slurp splash", "Sprunk"});

        Character rogue2 = new Character("Voldemort", 'R',
                95, 100,7, 2200,
                100, new String[]{"Bow", "Dagger","Slurp splash", "Shield"});

        System.out.println("===CHARACTERS STATUS===");
        warrior1.printCharacterSheet();
        //warrior1.printInventory();

        rogue2.printCharacterSheet();
        //rogue2.printInventory();

        System.out.println("Health status: ");
        warrior1.damage(30);
        warrior1.heal(35);
        warrior1.addXP(600);
        warrior1.removeGold(50);
        warrior1.levelUp();

        System.out.println();
        /*if (warrior1.removeGold(100.0)) {
            System.out.println("Bought a potion!");
        } else {
            System.out.println("Not enough gold!");
        }*/

        System.out.println(warrior1.getName() +"'s health: " + warrior1.getHealthPercentage()+ "%");

        if (warrior1.isHealthCritical()) {
            System.out.println("WARNING: Find a healer!");
        }

    }

       /*System.out.println("\n===STATUS===");
        //warrior1.levelUp();
        warrior1.addXP(600);
        warrior1.addGold(100);

        System.out.println("\n===COMBAT===");
        System.out.println("Health status: ");
        warrior1.damage(30);
        warrior1.heal(35);
        warrior1.isAlive();*/


        /*double healthPerc = warrior1.getHealthPercentage();
        System.out.println("Health Percent: "+ healthPerc);*/






 }


