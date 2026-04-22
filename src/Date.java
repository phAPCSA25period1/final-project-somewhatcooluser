public class Date {
    private int year;
    private int month;
    private int day;

    public Date()
    {
        year = 1990;
        month = 1;
        day = 1;
    }

    public void addToDate(String choice)
    {
        // test choosing either year, month, or day
        int theTotal = RollDice.Roll();
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
        if (choice.equals("year"))
        {
            year = year - theTotal;
        }
        else if (choice.equals("month"))
        {
            month = month - theTotal;
            if (month < 1)
            {
                month = month + 12;
                year = year - 1;
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
        }
    }

    public String getDate()
    {
        return year + "-" + month + "-" + day;
    }
}
