public class Date {
    private int year;
    private int month;
    private int day;
    private int rollCount;

    public Date()
    {
        year = (int)(Math.random() * 201) + 1900; // generates a random year between 1900 and 2100
        month = (int)(Math.random() * 12) + 1;
        day = (int)(Math.random() * 31) + 1;
        rollCount = 0;
    }

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

    public String getDate()
    {
        return year + "-" + month + "-" + day;
    }

    public int getRollCount()
    {
        return rollCount;
    }
}
