public class MySecondCar implements CarInterface{
    @Override
    public void start() {
        System.out.println("Checking all systems....");
        System.out.println("Your Toyota Avensis needs some oil!");
    }

    @Override
    public void beep() {
        System.out.println("BEEEEP");
    }
}
