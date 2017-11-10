public class Date {

    private String month;
    private int day;
    private String year;
    private int daysOfTheMonth;

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
        int daysLeft = addedDays;
        months(month);

        if(day + addedDays <= daysOfTheMonth) {
            day = day + addedDays;
        } else {

            int daysLeftInMonth = daysOfTheMonth - day;
            day = day + daysLeftInMonth;
            daysLeft = daysLeft - daysLeftInMonth;
            month = "" + (Integer.parseInt(month) + 1);
            while(daysLeft > 0) {
                if(daysLeft < daysLeftInMonth) {
                    day = daysLeft;
                    daysLeft = daysLeft - daysLeft;
                    month = "" + (Integer.parseInt(month) + 1);
                } else {
                    months(month);
                    daysLeftInMonth = daysOfTheMonth;
                    daysLeft = daysLeft - daysLeftInMonth;

                }

                if(daysLeft > daysOfTheMonth) {
                    month = "" + (Integer.parseInt(month) + 1);
                }

                if(Integer.parseInt(month) > 12) {
                    month = "" + 1;
                    year = "" + (Integer.parseInt(year) + 1);
                }
            }

        }

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
                this.month = "1";
                daysOfTheMonth = 31;
                break;
            case "Febuary":
                this.month = "2";
                daysOfTheMonth = 28;
                break;
            case "March":
                this.month = "3";
                daysOfTheMonth = 31;
            case "April":
                this.month = "4";
                daysOfTheMonth = 30;
                break;
            case "May":
                this.month = "5";
                daysOfTheMonth = 31;
                break;
            case "June":
                this.month = "6";
                daysOfTheMonth = 30;
                break;
            case "July":
                this.month = "7";
                daysOfTheMonth = 31;
                break;
            case "August":
                this.month = "8";
                daysOfTheMonth = 31;
                break;
            case "September":
                this.month = "9";
                daysOfTheMonth = 30;
                break;
            case "October":
                this.month = "10";
                daysOfTheMonth = 31;
                break;
            case "November":
                this.month = "11";
                daysOfTheMonth = 30;
                break;
            case "December":
                this.month = "12";
                daysOfTheMonth = 31;
                break;
        }

        switch(month) {
            case "1":
                this.month = "1";
                daysOfTheMonth = 31;
                break;
            case "2":
                this.month = "2";
                daysOfTheMonth = 28;
                break;
            case "3":
                this.month = "3";
                daysOfTheMonth = 31;
                break;
            case "4":
                this.month = "4";
                daysOfTheMonth = 30;
                break;
            case "5":
                this.month = "5";
                daysOfTheMonth = 31;
                break;
            case "6":
                this.month = "6";
                daysOfTheMonth = 30;
                break;
            case "7":
                this.month = "7";
                daysOfTheMonth = 31;
                break;
            case "8":
                this.month = "8";
                daysOfTheMonth = 31;
                break;
            case "9":
                this.month = "9";
                daysOfTheMonth = 30;
                break;
            case "10":
                this.month = "10";
                daysOfTheMonth = 31;
                break;
            case "11":
                this.month = "11";
                daysOfTheMonth = 30;
                break;
            case "12":
                this.month = "12";
                daysOfTheMonth = 31;
                break;
        }

    }
}
