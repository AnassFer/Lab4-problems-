package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return  ((temperatureCelsius*9/5)+32);
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return "Current weather: %f°C (%f°F) and %s".formatted(temperatureCelsius, temperatureFahrenheit(), conditions);
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
       return new WeatherData((tempFahrenheit - 32) * 5/9, conditions);
    }

    public static void main(String[] args) {
        WeatherData w1 = new WeatherData(10, "Cloudy");
        WeatherData w2 = WeatherData.fromFahrenheit(77, "Sunny");
        System.out.println("Today's weather: "+w2.getSummary());
        System.out.println("Yesterday's weather: "+w1.getSummary());
    }

}
