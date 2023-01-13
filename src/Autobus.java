import java.util.ArrayList;
import java.util.List;

public class Autobus extends transport implements Competing {
    private Capacity capacity;
    public static List<DriverAutobus> driverAutobuses = new ArrayList<>();
    public Autobus(String mark, String model, double engineVolume, Capacity capacity) {
        super(mark, model, engineVolume);
        this.capacity=capacity;

    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
    public void addDriver(DriverAutobus driver) {
        driverAutobuses.add(driver);
    }

    @Override
    public void Start() {
        System.out.println("начинаю движение");
    }

    public void End() {
        System.out.println("заканчиваю движение");
    }

    @Override
    public void Type() {
        if (capacity == null) {
            System.out.println("данных недостаточно");
        } else {
            System.out.println("Вместительность от: " + capacity.getTo() + "до : " + capacity.getFrom());
        }
    }

    @Override
    public boolean diagostika() {
        System.out.println(getMark() +" диагностика не требуется");
        return true;
    }

    @Override
    public void fixed() {
        if (diagostika() == true) {
            System.out.println("ремонт не требуется");
        } else {
            System.out.println("транспортное средство " + getMark() + " отремонтировано");
        }
    }


    public void pitStop() {
        System.out.println("совершаю пит стоп");
    }


    @Override
    public void bestLapTime(String time) {
        System.out.println("лучшее время круга " + time);
    }


    @Override
    public void maxSpeed(String speed) {
        System.out.println("максимальная скорость " + speed);
    }
}
