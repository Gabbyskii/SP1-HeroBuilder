import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // opretter første karakyer obj
        Character char1 = new Character("Ragnar", 'W',
                85, 100, 5, 2300,
                156.50);

        System.out.println("===CHARACTER STATUS===");
        char1.printCharacterSheet();

        char1.printInventory();

        System.out.println("\n===STATUS===");
        char1.levelUp();

        System.out.println("\n===COMBAT===");
        System.out.println("Health status: ");
        char1.damage(30);
        char1.heal(10);
        char1.health();

        double healthPerc = char1.getHealthPercentage();
        System.out.println("Health Percent: "+ healthPerc);


        //TODO: gå igang med iteration 3 - metoder:
        char1.addGold(100);
        char1.addXP(500);




    }

}
