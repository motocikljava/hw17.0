import java.util.List;
import java.util.Objects;

public class DriverCar<A extends Car>{
    private String driverSecName;
    final char category = 'A';
    private  int experience;


    public DriverCar(String driverSecName, final char CATEGORY , int experience) {
        if (driverSecName != null) {
            this.driverSecName = driverSecName;
        }
        if (CATEGORY != 'A') {
            throw new IllegalArgumentException("Введена неверная категория");
        }

        if (experience != 0) {
            this.experience = experience;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverCar<?> driverCar = (DriverCar<?>) o;
        return category == driverCar.category && experience == driverCar.experience && driverSecName.equals(driverCar.driverSecName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverSecName, category, experience);
    }

    public void driveStart(A transport) {
        System.out.println("водитель " + getDriverSecName() + " управляет автомобилем "
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

