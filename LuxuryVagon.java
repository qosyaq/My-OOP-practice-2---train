package vagon;

public class LuxuryVagon extends Vagon{
    int numOfRooms;
    int numOfToilets;
    public int people;
    final double cost = 299.9; // $
    int numOfShower;


    public LuxuryVagon(double weight, double volume, int numOfRooms, int numOfToilets, int people, int numOfShower) {
        super(weight, volume);
        this.numOfRooms = numOfRooms;
        this.numOfToilets = numOfToilets;
        this.people = people;
        this.numOfShower = numOfShower;
    }

    public double wholeweight(){
        return weight + (people * 70);
    }
    public double getCost() {
        return cost;
    }
}
