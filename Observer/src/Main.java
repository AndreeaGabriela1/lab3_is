public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        // Simulate changes in weather data
        weatherData.setMeasurements(30.0f, 60.0f, 101.3f);
        weatherData.setMeasurements(28.0f, 65.0f, 101.2f);
        weatherData.setMeasurements(32.0f, 63.0f, 101.4f);
    }
}
