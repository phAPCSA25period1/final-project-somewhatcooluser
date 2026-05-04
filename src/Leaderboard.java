public class Leaderboard {

    public static void displayLeaderboard(String[][] theList)
    {
        System.out.println("Leaderboard:");
        for (int i = 0; i < theList.length; i++)
        {
            System.out.println("Player " + (i + 1) + ": " + theList[i][0] + " rolls");
        }
    }

}
