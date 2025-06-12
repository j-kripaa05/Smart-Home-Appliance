public class Light {
    private boolean isOn;

    public Light() {
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Light is turned on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light is turned off");
    }

    public boolean isOn() {
        return isOn;
    }

}