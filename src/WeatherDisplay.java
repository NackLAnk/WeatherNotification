public class WeatherDisplay implements Observer {
    private Double temperature;

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        if (temperature != null) {
            System.out.println("Temperature: " + temperature + " degrees by Celsius");
            System.out.println("------------------------------------");
        } else {
            System.out.println("Connection Error!");
        }
    }
}