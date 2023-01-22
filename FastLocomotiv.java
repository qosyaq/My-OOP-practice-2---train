package vagon;
import engine.Engine;

public class FastLocomotiv extends Locomotiv {
    Engine engine = new Engine(110000000, "Italy");
    public FastLocomotiv(double weight, double volume) {
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
