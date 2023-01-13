import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car extends transport implements Competing {
    private TypeKuzov typeKuzov;
    private static List<DriverCar> driverCars = new ArrayList<>();
    public Car(String mark, String model, double engineVolume, TypeKuzov typeKuzov) {
        super(mark, model, engineVolume);
        this.typeKuzov=typeKuzov;
    }

    public TypeKuzov getTypeKuzov() {
        return typeKuzov;
    }

    public void setTypeKuzov(TypeKuzov typeKuzov) {
        this.typeKuzov = typeKuzov;
    }
    public void addDriver(DriverCar driver) {
        driverCars.add(driver);
    }

    @Override
    public void Start() {
        System.out.println("начинаю движение");
    }
    @Override
    public void End() {
        System.out.println("заканчиваю движение");
    }

    @Override
    public void Type() {
        if (typeKuzov == null) {
            System.out.println("данных недостаточно");
        } else {
            System.out.println(typeKuzov.name());
        }
    }

    @Override
    public boolean diagostika() {
        int min = 1;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;
        return i > 50;
    }

    @Override
    public void fixed() {
        if (diagostika() == true) {
            System.out.println("ремонт не требуется");
        } else {
            System.out.println("транспортное средство " + getMark() + " отремонтировано");
        }
    }

    @Override
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