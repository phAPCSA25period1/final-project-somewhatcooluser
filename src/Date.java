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

    public void addToDate()
    {
        // test choosing either year, month, or day
        year = 10 + year;
    }
}
