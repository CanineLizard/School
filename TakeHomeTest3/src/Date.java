public class Date {

    private String month;
    private int day;
    private String year;

    public Date() {
       month = "";
       day = 0;
       year = "";
    }

    public Date(String month, int day, String year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void addDays(int addedDays) {
        day = addedDays + day;
    }

    public int subtractDays(int subDays) {
        return 0;
    }

    public String toString() {
        return month +"/" + day + "/" + year;
    }

    public void months(String month) {
        switch(month) {
            case "January":
                month = "1";
                break;
            case "Febuary":
                month = "2";
                break;
            case "March":
                month = "3";
            case "April":
                month = "4";
                break;
        }
    }
}
