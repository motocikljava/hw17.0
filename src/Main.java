import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Vesta cross", 2.8, TypeKuzov.SEDAN);
        Car porshe = new Car("Porshe", "Panamera", 3.0, TypeKuzov.COUPE);
        Car ferrari = new Car("Ferrari", "Enzo", 3.4, TypeKuzov.COUPE);
        Car delorian = new Car("Delorian", "V2.0", 2.0, TypeKuzov.SEDAN);
        Autobus paz = new Autobus("PAZ", "turbo", 4.0, Capacity.SMALL);
        Autobus vw = new Autobus("Volks Wagen", "Big bug", 3.0, Capacity.MEDIUM);
        Autobus volvo = new Autobus("Volvo", "S900", 4.0, Capacity.VERY_LARGE);
        Autobus mersedes = new Autobus("Mersedes", "grand s200", 3.8, Capacity.LARGE);
        Truck kamaz = new Truck("KAMAZ", "cybertruck", 4.2, LoadCapacity.N1);
        Truck belaz = new Truck("BELAZ", "Gigatruck", 5.2,LoadCapacity.N3);
        Truck man = new Truck("MAN", "woman", 4.0, LoadCapacity.N2);
        Truck zil = new Truck("ZIL", "old shool", 4.6,LoadCapacity.N1);
        System.out.println(zil);
        zil.Start();
        zil.pitStop();
        zil.End();
        zil.maxSpeed("280 км/ч");
        zil.bestLapTime("2:30");
        transport.seprator();
        System.out.println(man);
        man.Start();
        man.pitStop();
        man.End();
        man.maxSpeed("300 км/ч");
        man.bestLapTime("2:20");
        transport.seprator();
        System.out.println(belaz);
        belaz.Start();
        belaz.pitStop();
        belaz.End();
        belaz.maxSpeed("260 км/ч");
        belaz.bestLapTime("2:40");
        transport.seprator();
        System.out.println(kamaz);
        kamaz.Start();
        kamaz.pitStop();
        kamaz.End();
        kamaz.maxSpeed("290 км/ч");
        kamaz.bestLapTime("2:24");
        transport.seprator();
        List<transport> transports = List.of(delorian,porshe,zil,man,volvo,mersedes);
        Mechanic<transport> pin = new Mechanic<>("Pin","Smesharikov","Smeshariki&co");
        Mechanic<Truck> krosh = new Mechanic<>("Krosh","Smesharikov","Smeshariki&co");
        Mechanic<Car> losyash = new Mechanic<>("Losyash","Smesharikov","Smeshariki&co");
        Sponsor<transport> smeshar= new Sponsor<>("Smeshariki&co", 2000);
        Sponsor<transport> scrooge= new Sponsor<>("UtinieHistory", 1500);

        man.addDriver(new DriverTruck<>("Volkov", 'B', 12));
        man.addMechanic(krosh);
        man.addSponsor(scrooge);
        zil.addDriver(new DriverTruck<>("Koshkin", 'B', 9));
        zil.addMechanic(pin);
        zil.addSponsor(smeshar);
        delorian.addDriver(new DriverCar<>("Doktorov", 'A', 10));
        delorian.addMechanic(losyash);
        delorian.addSponsor(scrooge);
        porshe.addDriver(new DriverCar<>("Ferdinandov", 'A', 15));
        porshe.addMechanic(losyash);
        porshe.addSponsor(smeshar);
        volvo.addDriver(new DriverAutobus<>("Lowertunel", 'C', 2));
        volvo.addMechanic(pin);
        volvo.addSponsor(smeshar);
        mersedes.addDriver(new DriverAutobus<>("Starikov", 'C', 13));
        mersedes.addMechanic(pin);
        mersedes.addSponsor(scrooge);





        DriverCar<Car> lev = new DriverCar<>("Levchenko", 'A', 10);
        lev.driveStart(lada);
        DriverTruck<Truck> volk = new DriverTruck<>("Volkov", 'B', 12);
        volk.driveStart(zil);
        DriverAutobus<Autobus> low = new DriverAutobus<>("Lowertunel", 'C', 2);
        low.driveStart(volvo);


        Mechanic<transport> pin1 = new Mechanic<>("Pin","Smesharikov","Smeshariki&co");
        zil.addMechanic(pin1);
        System.out.println(Mechanic.getServiceMachin());

        diagnostika(delorian, lada, porshe, mersedes,kamaz,belaz);
    }
    public static void diagnostika (transport... cars) {
        for (transport transports : cars) {
            if (!transports.diagostika()) {
                try {
                    throw new RuntimeException(" Автомобиль не прошёл диагностику " + transports.getMark());
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }

            } else {
                System.out.println("Автомобиль прошёл диагностику " + transports.getMark());
            }
        }

    }


}