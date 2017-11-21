import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        try {
            Scanner inFile = new Scanner(new File(""));
        }catch(FileNotFoundException e) {

        }

        Date d;
        Date d2;

        String date;
        String user;
        String month;
        int day;
        String year;

        int plusDays;
        int subDays;

        System.out.print("Enter the date");
        date = input.nextLine();

        System.out.println("Would you like to add or subtract days?");
        user = input.nextLine();

        StringTokenizer st = new StringTokenizer(date, "/ ");
        month = st.nextToken();
        day = Integer.parseInt(st.nextToken());
        year = st.nextToken();

        d = new Date(month, day, year);

        if(user.toLowerCase().equals("add")) {
            System.out.println("Enter the amount of days you want to add");
            plusDays = input.nextInt();

            d.addDays(plusDays);

            System.out.println(d);

        } else if(user.toLowerCase().equals("subtract")) {
            System.out.println("Enter the amount of days you want to subtract");
            subDays = input.nextInt();

            d.subtractDays(subDays);

            System.out.println(d);
        } else if(user.toLowerCase().equals("3")) {
            System.out.println("Enter a second date");
            date = input.nextLine();

            st = new StringTokenizer(date, "/ ");
            month = st.nextToken();
            day = Integer.parseInt(st.nextToken());
            year = st.nextToken();

            d2 = new Date(month, day, year);

             System.out.println(d.daysBetween(d2));

        }
    }
}
