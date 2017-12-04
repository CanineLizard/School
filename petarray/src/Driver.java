import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Driver {
    public static void main(String[] args) {
        Scanner inFile = null;

        Client[] client = new Client[5];

        try {

            inFile = new Scanner(new File("clientdata.txt"));
        }catch(FileNotFoundException e) {
            System.out.println(e);
        }

        while(inFile.hasNextLine()) {




            for(int i = 0; i < client.length; i++) {
                String file = inFile.nextLine();
                StringTokenizer tk = new StringTokenizer(file, ",");
                client[i] = new Client(tk.nextToken(), tk.nextToken(),tk.nextToken(), tk.nextToken(), tk.nextToken(), tk.nextToken(), Integer.parseInt(tk.nextToken()));

                for(int j = 0; j < client[i].getAmountOfPets(); j++) {
                    file = inFile.nextLine();

                    tk = new StringTokenizer(file, ",");
                    client[i].setPets(j, tk.nextToken(), tk.nextToken(), tk.nextToken(), tk.nextToken(), tk.nextToken());
                }
            }
        }

        for(int i = 0; i < client.length; i++) {
            System.out.println(client[i]);
        }
    }
}
