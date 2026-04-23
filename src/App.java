import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Initialize objects
        Date theDate = new Date();
        boolean isDone = true;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your birthdate.");
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
                System.out.println("Would you like to play again? (yes or no)");
                String answer3 = input.nextLine();
                if (answer3.equals("no"))
                {
                    System.out.println("Thank you for playing! Goodbye!");
                    isDone = false;
                    break;
                }
                // Check this later
                // isDone = false;
                // continue;
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

        // test stuff goes here
        // int test = RollDice.Roll();
        // System.out.println(test);
    }
}
