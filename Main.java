public class Main {
    public static void main(String[] args) {
        WizzAir a = new WizzAir();
        AirMoldova b = new AirMoldova();

        a.flight_hour();
        b.flight_hour();

        MyCar car1 = new MyCar();
        MySecondCar car2 = new MySecondCar();

        car1.breaks();
        car1.auto_lock(2);
        car1.status();
        car1.fuel_consumption();

        car2.beep();
        car2.start();

    }
}
