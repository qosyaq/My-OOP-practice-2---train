package train;
import prof.Profession;
import vagon.FastLocomotiv;
import vagon.GruzVagon;
import vagon.Locomotiv;

public class ftrain {

    Profession driver;
    Locomotiv locomotiv;
    GruzVagon[] vagon;
    int whowei;
    int numOfV;
    String A;
    String B;
    double road;
    double time;
    public ftrain(Profession driver, Locomotiv locomotiv, GruzVagon[] vagon, String A, String B, double road) {
        this.driver = driver;
        this.vagon = vagon;
        this.locomotiv = locomotiv;
        this.A = A;
        this.B = B;
        this.road = road;
        for(int i = 0; i < vagon.length; i++){
            whowei += vagon[i].wholeweight();
        }
        whowei += locomotiv.wholeweight();

        numOfV = vagon.length + 1;
    }

    public void wholeweigth() {
        System.out.println("Whole weight: " + whowei + " kilogram");
    }
    double maxSpeed;
    public void maxSpeed(){
        maxSpeed = Math.sqrt(locomotiv.getPower()/whowei) * 3.6;
        System.out.println("Max speed: " + Math.round(maxSpeed) + " km/h");
    }

    public void vagons(){
        System.out.println("Num of Vagons: " + numOfV);
    }

    public void Employee_information(){
            System.out.println(driver.getTypeProf() + ": " + driver.getFullname() + ", experience: " + driver.getExp() + " years");
    }
    public void Transportation(){
        System.out.print("Transportation: ");
        for(GruzVagon vagon1: vagon){
            System.out.print(vagon1.getTransportation() + " ");
        }
    }
    public void route(){
        time = road / maxSpeed;
        System.out.println("Route: " + A + "-" + B + ", The driving time will take " + Math.round(time) + " hours");
    }

    public void getManufacturer(){
        System.out.println("Manufacturer of engine: " + locomotiv.getManufacturer());
    }
}
