public class Thermostat {
    private int temperature;

    public Thermostat(){
        this.temperature = 22; 
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature + " degrees");
    }

    public int getTemperature() {
        System.out.println("Temperature is "+temperature);
        return temperature;
    }
}