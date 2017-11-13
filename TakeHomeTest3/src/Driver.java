import java.util.Scanner;
import java.util.StringTokenizer;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date d;

        String date;
        String user;
        String month;
        int day;
        String year;

        int plusDays;
        int subDays;

        System.out.print("Enter the date");
        date = input.nextLine();

        System.out.println("Would you like to add to subtract days?");
        user = input.nextLine();

        StringTokenizer st = new StringTokenizer(date, "/");
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
        }
    }
}
