package vagon;

public class EconomVagon extends Vagon{
    int numOfRooms;
    int numOfToilets;
    public int people;
    final double cost = 99.9; // $

    public EconomVagon(double weight, double volume, int numOfRooms, int numOfToilets, int people) {
        super(weight, volume);
        this.numOfRooms = numOfRooms;
        this.numOfToilets = numOfToilets;
        this.people = people;
    }
    public double wholeweight(){
        return weight + (people * 70);
    }

    public double getCost() {
        return cost;
    }
}
