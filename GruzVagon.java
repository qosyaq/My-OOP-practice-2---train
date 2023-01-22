package vagon;

public class GruzVagon extends Vagon{
    String Transportation;
    double weightOfTransportation;

    public GruzVagon(double weight, double volume, String Transportation, double weightOfTransportation) {
        super(weight, volume);
        this.Transportation = Transportation;
        this.weightOfTransportation = weightOfTransportation;
    }
    public double wholeweight(){
        return weight + weightOfTransportation;
    }

    public String getTransportation() {
        return Transportation;
    }

    public double getWeightOfTransportation() {
        return weightOfTransportation;
    }
}
