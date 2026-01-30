import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // opretter første karakyer obj
        Character char1 = new Character("Ragnar", 'W',
                85, 100, 5, 2300,
                156.50, true);

        System.out.println("===CHARACTER STATUS===");
        System.out.println(char1);

        //inventory array
        String[] inventory = new String[]{"Ax", "Knife", "Slurp splash", "Sprunk"};
        System.out.println("\nInventory ("+ inventory.length+ " items)");
        for (int i = 0; i < inventory.length; i++){
            System.out.println(inventory[i]);
        }

        System.out.println();
        //TODO: bliv færdig med iteration 2:

        System.out.println("===COMBAT===");
        System.out.println("Health status: ");
        char1.damage(30);
        char1.health();





    }

}
