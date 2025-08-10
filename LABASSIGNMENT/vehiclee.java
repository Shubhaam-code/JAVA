abstract class vehicle{
    abstract void start();

    void stop(){
        System.out.println("VEHICLE IS STOP.....");
    }

}
interface fuelefficiency{
    void getmileage();
}
class car extends vehicle implements fuelefficiency {
    public void start(){
        System.out.println("CAR IS START.....");
    }
    public void getmileage(){
        System.out.println("CAR MILEAGE IS 15.....");

    }
}
class bike extends vehicle implements fuelefficiency {
    public void start(){
        System.out.println("BIKE IS START.....");
    }
    public void getmileage(){
        System.out.println("BIKE MILEAGE IS 30.....");

    }
}

public class vehiclee{
    public static void main(String args []){
        car c1= new car();
        bike b1 = new bike();
        c1.start();
        c1.getmileage();
        c1.stop();
        b1.start();
        b1.getmileage();
        b1.stop();
    }
}