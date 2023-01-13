import java.util.List;

public class DriverAutobus<C extends Autobus> {
    private String driverSecName;
    final char CATEGORY = 'C';
    private int experience;


    public DriverAutobus(String driverSecName, final char CATEGORY, int experience) {
        if (driverSecName != null) {
            this.driverSecName = driverSecName;
        }
        if (CATEGORY != 'C') {
            throw new IllegalArgumentException("Введена неверная категория");
        }

        if (experience != 0) {
            this.experience = experience;
        }

    }

    public void driveStart(C transport) {
        System.out.println("водитель " + getDriverSecName() + " управляет автобусом "
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
