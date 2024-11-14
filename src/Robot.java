public class Robot {
    int batteryLevel = 100; // Battery level percentage (0 to 100)
    int speed = 0; // Current speed of the robot
    String name = "Robo"; // Name of the robot


    public void move(String carName) {
         speed = 5;
        System.out.println(carName + "is moving at speed" + speed + "mph");
    }

    public void stop() {
        speed = 0;
        System.out.println(name + "has stopped");
    }

    public void chargeBattery(){
        batteryLevel = 100;
        System.out.println(name + "'s battery is fully charged");
    }

    public void checkBatteryLevel(){
        System.out.println(name + "'current battery level is" + batteryLevel + "%.");
    }
}