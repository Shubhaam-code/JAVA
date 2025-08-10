abstract class electronicdevice{
    abstract void poweron();
    void poweroff(){
        System.out.println("SYSTEM IS POWER OFF");

    }

}

interface networkconnectable{
    default void connecttonetwork(){
        System.out.println("NETWORK IS CONNECTED");

    }
}

class smartphone extends electronicdevice implements networkconnectable{
    void battery(){
        System.out.println("SYSTEM BATTERY IS 1%");

    }
    void poweron(){
        System.out.println("SYSTEM  IS POWER ON :");
        
    }


}

class DEVICE{
    public static void main(String args []){
        smartphone motorola =new smartphone();
        motorola.poweron();
        motorola.connecttonetwork();
        motorola.battery();
        motorola.poweroff();
        
        

    }
}
