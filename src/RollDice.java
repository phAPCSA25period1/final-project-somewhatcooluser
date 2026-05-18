/**
 * The RollDice class manages the total after each dice roll.
 */
public class RollDice {

    /**
     * Rolls 2 dice and adds them up.
     * @return The total from the 2 dice rolls.
     */
    public static int Roll()
    {
        int die1 = (int)(Math.random() * 6) + 1;
        int die2 = (int)(Math.random() * 6) + 1;
        int total = die1 + die2;
        System.out.println("You rolled a " + die1 + " and a " + die2 + " for a total of " + total);
        System.out.println();
        return total;
    }
}
