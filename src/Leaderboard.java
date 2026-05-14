public class Leaderboard {

    public static void displayLeaderboard(String[][] theList)
    {
        for (int i = 0; i < theList[0].length; i++)
        {
            System.out.println("Attempt " + (i + 1) + ": " + theList[0][i]);
        }
    }

    public static void resetLeaderboard(String[] theArray)
    {
        for (int i = 0; i < theArray.length; i++)
        {
            theArray[i] = null;
        }
    }

}
