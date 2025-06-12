public class SecuritySystem {
    private boolean isArmed;

    public SecuritySystem() {
        this.isArmed = false;
    }

    public void arm() {
        isArmed = true;
        System.out.println("Security system armed");
    }

    public void disarm() {
        isArmed = false;
        System.out.println("Security system disarmed");
    }

    public boolean isArmed() {
        return isArmed;
    }
}