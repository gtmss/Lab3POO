abstract class CarFunctions {
    public void fuel_consumption(){
        System.out.println("Now fuel consumption is 0");
    }

    public void auto_lock(int check){
        if (check > 1) System.out.println("Car is locked");
        else System.out.println("Car is open");
    }

    public abstract void breaks();

}
