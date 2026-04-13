public class RollDice {

    public static int Roll()
    {
        int die1 = (int)(Math.random() * 6) + 1;
        int die2 = (int)(Math.random() * 6) + 1;
        int total = die1 + die2;
        return total;
    }
}
