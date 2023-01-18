import java.util.*;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverTruck<?> that = (DriverTruck<?>) o;
        return CATEGORY == that.CATEGORY && experience == that.experience && driverSecName.equals(that.driverSecName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverSecName, CATEGORY, experience);
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


