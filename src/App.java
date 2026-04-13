public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter your birthdate.");
        System.out.println();
        System.out.println("Birthday:");
        Date theDate = new Date();

        // test stuff goes here
        int test = RollDice.Roll();
        System.out.println(test);
        System.out.println(theDate.getDate());
    }
}
