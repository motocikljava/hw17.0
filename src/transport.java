import java.sql.Driver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class transport {

    protected String mark;
    protected String model;
    double engineVolume;
    private final ArrayList<Mechanic> mechanics = new ArrayList<>();
    private final ArrayList<Sponsor> sponsors = new ArrayList<>();


    public transport(String mark, String model, double engineVolume) {
        if (mark != null) {
            this.mark = mark;
        } else {
            this.mark = "unknown mark";
        }
        if (model != null) {
            this.model = model;
        } else {
            this.model = "unknown model";
        }

        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;

        }
    }
    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }
    public void addMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
    }

    public String getMark() {
        return mark;
    }


    @Override
    public String toString() {
        return "transport{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + getEngineVolume() +
                '}';
    }

    public String getModel() {
        return model;
    }


    public double getEngineVolume () {
        return engineVolume;
    }

    public void setEngineVolume ( double engineVolume){
        this.engineVolume = engineVolume;
    }

    public abstract void Start();

    public abstract void End();
    public abstract void Type();
    public abstract boolean diagostika();
    public abstract void fixed();

    public static void seprator(){
        System.out.println("=========================================================");
    }
}
