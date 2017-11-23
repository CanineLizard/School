/**
 * Driver class that uses the date class
 *
 * @Author Austin White
 * @version 11/22/2017
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Date d;
        Date d2;

        String date;
        String user = "";
        String month;
        int day;
        String year;

        int plusDays;
        int subDays;

        //loops as long as the user does not enter 4
        while(!user.equals("4")) {
            //asks for the date
            System.out.println("Enter the date");
            date = input.nextLine();

            //displays the menu and waits for input
            System.out.println("1. Add days \n2. subtract days \n3. amount of days between two days \n4. quit");
            user = input.nextLine();

            //uses a string tokenizer to get month day and year
            StringTokenizer st = new StringTokenizer(date, "/, ");
            month = st.nextToken();
            day = Integer.parseInt(st.nextToken());
            year = st.nextToken();

            //creats a date object
            d = new Date(month, day, year);

            //checks if the user input is 1
            if(user.toLowerCase().equals("1")) {

                //asks for the amount of days the user wants to add
                System.out.println("Enter the amount of days you want to add");
                plusDays = input.nextInt();

                //calls the add method
                d.addDays(plusDays);

                //prints the date
                System.out.println(d);
                input.nextLine();

                //checks if the user input is 2
            } else if(user.toLowerCase().equals("2")) {

                //asks for the amount of days the user wants to subtract
                System.out.println("Enter the amount of days you want to subtract");
                subDays = input.nextInt();

                //calls the subtract method
                d.subtractDays(subDays);

                //prints the date
                System.out.println(d);
                input.nextLine();

                //checks if the user input is 3
            } else if(user.toLowerCase().equals("3")) {

                //asks for a second date
                System.out.println("Enter a second date");
                date = input.nextLine();

                //uses the string toeknizer for the second date
                st = new StringTokenizer(date, "/, ");
                month = st.nextToken();
                day = Integer.parseInt(st.nextToken());
                year = st.nextToken();

                //creates another date object
                d2 = new Date(month, day, year);

                //prints the days between the dates
                System.out.println(d.daysBetween(d2));
                input.nextLine();

                //checks if the user input is 4
            } else if(user.equals("4")) {

                //prints a goodbye message
                System.out.println("Goodbye");

                //if none of the menu choices were entered tell the user
            } else {
                System.out.println("That was not a menu choice. Please Try again");
            }

        }
    }
}
