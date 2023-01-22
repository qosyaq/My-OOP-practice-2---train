package vagon;
import engine.Engine;
public class Locomotiv extends Vagon{
    Engine engine = new Engine(70000000, "Germany");

    public Locomotiv(double weight, double volume) {
        super(weight, volume);
    }

    public double getPower() {
        return engine.power;
    }
    public String getManufacturer() {
        return engine.manufacturer;
    }
    public double wholeweight() {
        return weight;
    }
}
