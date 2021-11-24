public class MyCar extends CarFunctions {
    public void status(){
        System.out.println("Let's go !");
    }

    @Override
    public void breaks() {
        System.out.println("Breaks are good, can start...");
    }
}
