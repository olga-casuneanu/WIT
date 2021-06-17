public class DateControl {
    private int month;
    private int day;
    private int year;

    public DateControl(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void displayDate() {
        System.out.println(this.month + "/" + this.day + "/" + this.year);
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12)
            this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31)
            this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year >= 1900 && year <= 2021)
            this.year = year;
    }
}
