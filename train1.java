package train;
import prof.Profession;
import vagon.EconomVagon;
import vagon.LuxuryVagon;
import vagon.FastLocomotiv;

public class train1 {
    FastLocomotiv locomativ;
    LuxuryVagon[] lux;
    EconomVagon[] eco;
    Profession[] prof;

    String A;
    String B;
    int whowei;
    int numOfV;
    int people;
    double road;
    double time;
    double totalTicketPrice;

    public train1(FastLocomotiv locomativ, Profession[] prof, EconomVagon[] eco, LuxuryVagon[] lux, String A, String B, double road){
        this.locomativ = locomativ;
        this.lux = lux;
        this.eco = eco;
        this.prof = prof;
        this.A = A;
        this.B = B;
        this.road = road;

        for(int i = 0; i < lux.length; i++){
            whowei += lux[i].wholeweight();
            people += lux[i].people;
            totalTicketPrice += lux[i].people * lux[i].getCost();
        }
        for(int i = 0; i < eco.length; i++){
            whowei += eco[i].wholeweight();
            people += eco[i].people;
            totalTicketPrice += eco[i].people * eco[i].getCost();
        }
        whowei += locomativ.wholeweight();

        numOfV = lux.length + eco.length + 1;

        people += prof.length;
    }

    public void wholeweigth() {
        System.out.println("Whole weight: " + whowei + " kilogram");
    }
    double maxSpeed;
    public void maxSpeed(){
        maxSpeed = Math.sqrt(locomativ.getPower()/whowei) * 3.6;
        System.out.println("Max speed: " + Math.round(maxSpeed) + " km/h");
    }
    public void vagons(){
        System.out.println("Luxury vagons: " + lux.length + ", Econom vagons: " + eco.length);
        System.out.println("Total: " + numOfV);
    }

    public void Employee_information(){
        for(Profession pr: prof){
            System.out.println(pr.getTypeProf() + ": " + pr.getFullname() + ", experience: " + pr.getExp() + " years");
        }
    }
    public void People(){
        System.out.println("Amount of people: " + people);
    }
    public void route(){
        time = road / maxSpeed;
        System.out.println("Route: " + A + "-" + B + ", The driving time will take " + Math.round(time) + " hours");
    }

    public void getCost(){
        System.out.println("Luxury ticket costs: " + lux[0].getCost() + " $");
        System.out.println("Econom ticket costs: " + eco[0].getCost() + " $");
        System.out.println("Total ticket price: " + totalTicketPrice);
    }
    public void getManufacturer(){
        System.out.println("Manufacturer of engine: " + locomativ.getManufacturer());
    }
}
