public class RollDice {

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
