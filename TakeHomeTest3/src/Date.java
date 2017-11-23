/**
 * Date class. adds days from as date, subtract days from a date, finds the amount of days between two days
 *
 * @author Austin White
 * @version 11/22/2017
 */
public class Date {

    private String month;
    private int day;
    private String year;
    private int daysOfTheMonth;

    /**
     * Default constructor
     * sets all the fields to a default value of zero
     */
    public Date() {
       month = "";
       day = 0;
       year = "";
    }

    /**
     * over ride constructor
     * Sets all the fields to a given input
     * @param month
     * @param day
     * @param year
     */
    public Date(String month, int day, String year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    /**
     * addDays method
     * adds the amount of given days to a date
     * @param addedDays
     */
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
                    day = 1;
                }

                if(Integer.parseInt(month) > 12) {
                    month = "" + 1;
                    year = "" + (Integer.parseInt(year) + 1);
                }
            }

        }

    }

    /**
     * Subtract Days method
     * subtracts the amount of given days from a date
     * @param subDays
     */
    public void subtractDays(int subDays) {
        int daysLeft = subDays;
        months(month);

        if(day - subDays <= daysOfTheMonth && day - subDays > 0) {
            day = day - subDays;
        } else {

            int daysLeftInMonth = daysOfTheMonth;
            daysLeft = daysLeft - day;
            month = "" + (Integer.parseInt(month) - 1);
            while(daysLeft > 0) {
                months(month);
                daysLeftInMonth = daysOfTheMonth;


                if(daysLeft < daysLeftInMonth) {
                    month = "" + (Integer.parseInt(month) - 1);
                    months(month);
                    daysLeftInMonth = daysOfTheMonth;
                    day = daysLeftInMonth - daysLeft;
                    daysLeft = daysLeft - daysLeft;
                } else {
                    months(month);
                    daysLeftInMonth = daysOfTheMonth;
                    daysLeft = daysLeft - daysLeftInMonth;

                }

                if(daysLeft > daysLeftInMonth) {
                    month = "" + (Integer.parseInt(month) - 1);
                }

                if(Integer.parseInt(month) < 1) {
                    month = "" + 12;
                    year = "" + (Integer.parseInt(year) - 1);
                }
            }

        }

    }

    /**
     * daysBetween methods
     * Finds the amount of days from this date class and another date class
     * @param other
     * @return int - returns the number of days from two date classes
     */
    public int daysBetween(Date other) {
        int daysToDate = 0;

        if(month.equals(other.month) && year.equals(other.year)) {
            return other.day - day;
        } else if((Integer.parseInt(other.month) - Integer.parseInt(month)) > 0 || Integer.parseInt(year) - Integer.parseInt(other.year) > 0) {
            while(!equals(other)) {
                months(month);
                day -= 1;
                daysToDate++;

                if(day < 1) {
                    month = "" + (Integer.parseInt(month) - 1);
                    months(month);
                    day = daysOfTheMonth;
                    if(Integer.parseInt(month) < 1) {
                        year = "" + (Integer.parseInt(year) - 1);
                        month = "" + 12;
                        months(month);
                        day = daysOfTheMonth;
                    }
                }
            }

            return daysToDate;

        } else if((Integer.parseInt(month) - Integer.parseInt(other.month)) < 0 || Integer.parseInt(other.year) - Integer.parseInt(year) > 0) {
            while(!equals(other)) {
                months(month);
                day += 1;
                daysToDate++;
                if(day > daysOfTheMonth) {
                    month = "" + (Integer.parseInt(month) + 1);
                    day = 1;
                    if(Integer.parseInt(month) > 12) {
                        year = "" + (Integer.parseInt(year) + 1);
                        month = "" + 1;
                        day = 1;
                    }
                }
            }
        }



        return daysToDate;
    }

    /**
     * equals method
     * Checks if two date classes are equal
     * @param other
     * @return boolean - true if the dates are the same
     */
    public boolean equals(Date other) {

        return month.equals(other.month) && day == other.day && year.equals(other.year);
    }

    /**
     * toString method
     * returns the fields as a String
     * @return String
     */
    public String toString() {
        return month +"/" + day + "/" + year;
    }

    /**
     * months method
     * changes the month to a number format to make it easier to use for the add, subtract, and days between methods,
     * and gives the amount of days in the month
     * @param month
     */
    public void months(String month) {
        switch(month) {
            case "January":
                this.month = "1";
                daysOfTheMonth = 31;
                break;
            case "February":
                this.month = "2";
                daysOfTheMonth = 28;
                break;
            case "March":
                this.month = "3";
                daysOfTheMonth = 31;
                break;
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

    /**
     * getDate method
     * gets the date based on the format given
     * @param format
     * @return String - returns a short or long version of the date
     */
    public String getDate(char format) {
        if(format == 'L' || format == 'l') {
            switch(month) {
                case "1":
                    this.month = "January";
                    daysOfTheMonth = 31;
                    break;
                case "2":
                    this.month = "February";
                    daysOfTheMonth = 28;
                    break;
                case "3":
                    this.month = "March";
                    daysOfTheMonth = 31;
                    break;
                case "4":
                    this.month = "April";
                    daysOfTheMonth = 30;
                    break;
                case "5":
                    this.month = "May";
                    daysOfTheMonth = 31;
                    break;
                case "6":
                    this.month = "June";
                    daysOfTheMonth = 30;
                    break;
                case "7":
                    this.month = "July";
                    daysOfTheMonth = 31;
                    break;
                case "8":
                    this.month = "August";
                    daysOfTheMonth = 31;
                    break;
                case "9":
                    this.month = "September";
                    daysOfTheMonth = 30;
                    break;
                case "10":
                    this.month = "October";
                    daysOfTheMonth = 31;
                    break;
                case "11":
                    this.month = "November";
                    daysOfTheMonth = 30;
                    break;
                case "12":
                    this.month = "December";
                    daysOfTheMonth = 31;
                    break;
            }

            return month + " " + day + ", " + year;
        } else if(format == 'S' || format == 's') {
            months(month);
            return month + "/" + day + "/" + year;
        }

        return "";
    }
}
