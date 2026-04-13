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

    public void addToDate(int number)
    {
        // test choosing either year, month, or day
        year = year + number;
    }

    public void subtractToDate(int number)
    {
        year = year - number;
    }

    public String getDate()
    {
        return year + "-" + month + "-" + day;
    }
}
