/**
 * The Leaderboard class manages how the leaderboard should be displayed to the user.
 */
public class Leaderboard {

    /**
     * Prints the leaderboard in a readable format.
     * @param theList The 2D Array that has the leaderboard information.
     */
    public static void displayLeaderboard(String[][] theList)
    {
        for (int i = 0; i < theList[0].length; i++)
        {
            System.out.println("Attempt " + (i + 1) + ": " + theList[0][i]);
        }
    }

    /**
     * Resets the leaderboard so every score is null.
     * @param theArray The array that contains the scores.
     */
    public static void resetLeaderboard(String[] theArray)
    {
        for (int i = 0; i < theArray.length; i++)
        {
            theArray[i] = null;
        }
    }

    /**
     * Prints the highest score of a round after each round. Lower scores are better.
     * @param theArray The array that contains the scores.
     * @return The highest score that was found.
     */
    public static String getHighScore(String[] theArray)
    {
        int highestScore = Integer.MAX_VALUE;
        for (int i = 0; i < theArray.length; i++)
        {
            if (theArray[i] == null)
            {
                i++;
            }
            else if (Integer.parseInt(theArray[i]) < highestScore)
            {
                highestScore = Integer.parseInt(theArray[i]);
            }
        }
        return Integer.toString(highestScore);
    }

}
