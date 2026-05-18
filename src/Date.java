/**
 * The Date class manages the current date that the user has.
 * The date can change based on user input which will be called through methods.
 */
public class Date {
    private int year;
    private int month;
    private int day;
    private int rollCount;

    /**
     * Makes a new Date with a random year, month, and day.
     * A year can be between 1900 and 2100. Each month has 31 days for simplicity.
     */
    public Date()
    {
        year = (int)(Math.random() * 201) + 1900;
        month = (int)(Math.random() * 12) + 1;
        day = (int)(Math.random() * 31) + 1;
        rollCount = 0;
    }

    /**
     * Rolls 2 dice, gets the total from them, and adds it to what the user chose to change.
     * @param choice The part of the date the user has chose to change.
     */
    public void addToDate(String choice)
    {
        // for simplicity, we are going to assume that all months have 31 days and that there are no leap years
        int theTotal = RollDice.Roll();
        rollCount++;
        if (choice.equals("year"))
        {
            year = year + theTotal;
        }
        else if (choice.equals("month"))
        {
            month = month + theTotal;
            if (month > 12)
            {
                month = month - 12;
                year = year + 1;
            }
        }
        else if (choice.equals("day"))
        {
            day = day + theTotal;
            if (day > 31)
            {
                day = day - 31;
                month = month + 1;
                if (month > 12)
                {
                    month = month - 12;
                    year = year + 1;
                }
            }
        }
    }

    /**
     * Rolls 2 dice, gets the total from them, and subtracts it to what the user chose to change.
     * @param choice The part of the date the user has chose to change.
     */
    public void subtractToDate(String choice)
    {
        int theTotal = RollDice.Roll();
        rollCount++;
        if (choice.equals("year"))
        {
            year = year - theTotal;
            // edge case for if the year goes below 1000
            if (year < 1000)
            {
                year = 1990;
            }

        }
        else if (choice.equals("month"))
        {
            month = month - theTotal;
            if (month < 1)
            {
                month = month + 12;
                year = year - 1;
            }
            // another edge case for if the year goes below 1000
            if (year < 1000)
            {
                year = 1990;
            }
        }
        else if (choice.equals("day"))
        {
            day = day - theTotal;
            if (day < 1)
            {
                day = day + 31;
                month = month - 1;
                if (month < 1)
                {
                    month = month + 12;
                    year = year - 1;
                }
            }
            // yet another edge case for if the year goes below 1000
            if (year < 1000)
            {
                year = 1990;
            }
        }
    }

    /**
     * Returns the current date.
     * @return The date which consists of the year, month, and day.
     */
    public String getDate()
    {
        return year + "-" + month + "-" + day;
    }

    /**
     * Returns the current roll count.
     * @return The amount of times the user has rolled.
     */
    public int getRollCount()
    {
        return rollCount;
    }
}
