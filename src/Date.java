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
        }
        else if (choice.equals("day"))
        {
            day = day + theTotal;
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
        }
        else if (choice.equals("day"))
        {
            day = day - theTotal;
        }
    }

    public String getDate()
    {
        return year + "-" + month + "-" + day;
    }
}
