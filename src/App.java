import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Initialize objects
        Date theDate = new Date();
        boolean isDone = true;
        Scanner input = new Scanner(System.in);
        String[] score = new String[1];
        String[] tries = new String[10];
        String[][] triesList = {score, tries};

        System.out.println("Please enter your birthdate. Please note that each month has 31 days for simplicity.");
        System.out.println();

        while(isDone)
        {
            System.out.println("Birthday:");
            System.out.println(theDate.getDate());
            System.out.println();
            System.out.println("Would you like to change the year, month, or day? If your done, type done.");
            String answer = input.nextLine();

            if (answer.equals("done"))
            {
                System.out.println();
                System.out.println("Thank you for confirming your birthdate! Your final birthdate is " + theDate.getDate() + ", which took you " + theDate.getRollCount() + " rolls.");
                System.out.println();
                Leaderboard.displayLeaderboard(triesList);
                System.out.println();
                System.out.println("Would you like to play again? (yes or no)");
                String answer3 = input.nextLine();
                if (answer3.equals("no"))
                {
                    System.out.println();
                    System.out.println("Thank you for playing! Goodbye!");
                    isDone = false;
                    break;
                }
                else if (answer3.equals("yes"))
                {
                    System.out.println();
                    System.out.println("Please enter your birthdate. Please note that each month has 31 days for simplicity.");
                    System.out.println();
                    theDate = new Date();
                    continue;
                }
            }

            System.out.println();
            System.out.println("Would you like to add or subtract from the " + answer + "?");
            String answer2 = input.nextLine();
            System.out.println();

            if (answer2.equals("add"))
            {
                theDate.addToDate(answer);
            }
            else if (answer2.equals("subtract"))
            {
                theDate.subtractToDate(answer);
            }
        }
    }
}
