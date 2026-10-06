package recordemo;
//
//public record WeatherData(double temperatureCelsius, String conditions) {

public record WeatherData(double temperatureCelsius,String conditions){
    public double temperatureFahrenheit() {
        return (temperatureCelsius*9/5)+32;
    }
 // Instance method to get a formatted summary string
    public String getSummary() {
        String formatted=String.format("Current weather: %.1f°C (%.1f°F) and %s",temperatureCelsius,this.temperatureFahrenheit(),conditions);
        return formatted;
   }

   // Static factory method to create a WeatherData record from Fahrenheit
  public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        double tempCelsius=(tempFahrenheit -32)*5/9;
        return new WeatherData(tempCelsius,conditions);


  }

   public static void main(String[] args) {
        WeatherData todayWeather=new WeatherData(25.0,"Sunny");
        WeatherData yesterdayWeather=WeatherData.fromFahrenheit(50.0,"Cloudy");

       System.out.println("Today's weather: " + todayWeather.getSummary());
       System.out.println("Yesterday's weather: " + yesterdayWeather.getSummary());

   }
}
