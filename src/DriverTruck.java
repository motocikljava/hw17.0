import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DriverTruck<B extends Truck> {
    String driverSecName;
    final char CATEGORY = 'B';
    int experience;
    private static List<DriverTruck> driverTrucks;

    public DriverTruck(String driverSecName, final char CATEGORY, int experience) {
        if (driverSecName != null) {
            this.driverSecName = driverSecName;
        }
        if (CATEGORY != 'B') {
            throw new NullPointerException("Введена неверная категория");
        }

        if (experience != 0) {
            this.experience = experience;
        }

    }

    public void driveStart(B transport) {
        System.out.println("водитель " + getDriverSecName() + " управляет грузовиком "
                + transport.getMark() + " и будет участвовать в заезде");
    }

    @Override
    public String toString() {
        return "driver{" +
                "driverSecName='" + driverSecName;
    }


    public String getDriverSecName() {
        return driverSecName;
    }

    public void setDriverSecName(String driverSecName) {
        this.driverSecName = driverSecName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}


