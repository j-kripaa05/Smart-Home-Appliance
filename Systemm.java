import java.util.Scanner;

public class Systemm extends Thread{

    Scanner obj = new Scanner(System.in);
    Light livingRoomLight = new Light();
    Thermostat thermostat = new Thermostat();
    SecuritySystem securitySystem = new SecuritySystem();

    void command()
    {   
        System.out.println("Press 1 To Turn On System And 2 To Turn Off");
        int on= obj.nextInt();

        if(on == 1)
        {               
            try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Turning On the System..");
        System.out.println(" ");
        Thread thread1 = new Thread(() -> {    
        livingRoomLight.turnOn();
        });
        Thread thread2 = new Thread(() -> {
        thermostat.getTemperature();
        });
        Thread thread3 = new Thread(() -> {
        securitySystem.arm();
        });
        thread1.start();
        try {
        Thread.sleep(1000);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        thread2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.start();
        }

        else if (on == 2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Turning Off the System..");
            System.out.println(" ");
            Thread thread4 = new Thread(() -> {
                livingRoomLight.turnOff();
            });
    
            Thread thread5 = new Thread(() -> {
                thermostat.getTemperature();
            });
    
            Thread thread6 = new Thread(() -> {
                securitySystem.disarm();
            });
            thread4.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            thread5.start();
            try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
            e.printStackTrace();
            }
            thread6.start();
            }
            else{
            System.out.println("Invalid Request");
            }
        
    }
}
