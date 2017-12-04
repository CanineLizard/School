public class Client {
    private String lastName;
    private String firstName;
    private String address;
    private String clientId;
    private String numberOfVisits;
    private String outStandingBalance;
    private int amountOfPets;

    private Pet[] pets;

    public Client(String lastName, String firstName, String address, String clientId, String numberOfVisits, String outStandingBalance, int amountOfPets) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.clientId = clientId;
        this.numberOfVisits = numberOfVisits;
        this.outStandingBalance = outStandingBalance;
        this.amountOfPets = amountOfPets;

        pets = new Pet[amountOfPets];


    }

    public void setPets(int arrayPlace, String name, String type, String weight, String rabiesShot, String lastVisit ) {
        pets[arrayPlace] = new Pet(name, type, weight, rabiesShot, lastVisit);
    }

    public int getAmountOfPets() {
        return amountOfPets;
    }

    public String toString() {
        String allpets = "";

        for(int i = 0; i < pets.length; i++) {
            allpets += "\n\t" + pets[i].toString();
        }

        return "Last Name: " + lastName + "\nFirst Name: " + firstName +
                "\nAddress: " + address + "\nClient ID: " + clientId + "\nNumber of Visits: " + numberOfVisits +
                "\nOutstanding Balence: " + outStandingBalance + allpets + "\n";
    }

}
