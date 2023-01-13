import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Truck extends transport implements Competing{
    private LoadCapacity loadCapacity;
    private static List<DriverTruck> driverTrucks = new ArrayList<>();
    public Truck(String mark, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(mark, model, engineVolume);
        this.loadCapacity= loadCapacity;

    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public void addDriver(DriverTruck driver) {
        driverTrucks.add(driver);
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
        if (loadCapacity == null) {
            System.out.println("данных недостаточно");
        } else {
            System.out.println("Грузоподъёмность от : " + loadCapacity.getFrom() + " до " + loadCapacity.getTo());
        }
    }


    @Override
    public boolean diagostika() {
        int min = 1;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;
        return i > 80;
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
