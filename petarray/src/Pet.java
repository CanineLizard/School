public class Pet {

    private String name;
    private String type;
    private String weight;
    private String rabiesShot;
    private String lastVisit;

    public Pet() {
        name = "";
        type = "";
        weight = "";
        rabiesShot = "";
        lastVisit = "";
    }

    public Pet(String name, String type, String weight, String rabiesShot, String lastVisit) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.rabiesShot = rabiesShot;
        this.lastVisit = lastVisit;
    }

    public String toString() {
        return "Name : " + name + "\n\tType: " + type + "\n\tWeight: " + weight
                + "\n\tRabies Shot: " + rabiesShot + "\n\tLast Visit: " + lastVisit + "\n";
     }
}
