// WeatherTracker.java
import java.util.ArrayList;
import java.util.List;

public class WeatherTracker {
    private List<Weather> weatherReports;

    public WeatherTracker() {
        this.weatherReports = new ArrayList<>();
    }

    public void addWeatherReport(String city, double temperature, String conditions) {
        weatherReports.add(new Weather(city, temperature, conditions));
        System.out.println("Weather report added to the tracker.");
    }

    public void displayWeatherReports() {
        System.out.println("\nWeather Tracker:");
        if (weatherReports.isEmpty()) {
            System.out.println("No weather reports in the tracker.");
        } else {
            for (Weather report : weatherReports) {
                System.out.println(report.getCity() + ": " + report.getTemperature() + "°C, " + report.getConditions());
            }
        }
    }
}
