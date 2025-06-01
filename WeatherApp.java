import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherApp {
    public static void main(String[] args) {
        // Example: London coordinates
        double latitude = 51.5074;
        double longitude = -0.1278;

        String url = String.format(
            "https://api.open-meteo.com/v1/forecast?latitude=%.4f&longitude=%.4f&current_weather=true",
            latitude, longitude
        );

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();

            // Print full JSON (or parse manually below)
            System.out.println("✅ Raw Weather Data (JSON):");
            System.out.println(body);

            // Very basic extraction of temperature and windspeed from JSON (not using a JSON library)
            String temp = extractValue(body, "\"temperature\":", ",");
            String wind = extractValue(body, "\"windspeed\":", ",");

            System.out.println("\n📍 Weather Summary (London):");
            System.out.println("-----------------------------");
            System.out.println("🌡 Temperature: " + temp + " °C");
            System.out.println("💨 Wind Speed: " + wind + " km/h");

        } catch (Exception e) {
            System.out.println("Error fetching weather data: " + e.getMessage());
        }
    }

    // Helper method to extract a value from JSON string
    private static String extractValue(String json, String key, String endChar) {
        int start = json.indexOf(key);
        if (start == -1) return "N/A";
        start += key.length();
        int end = json.indexOf(endChar, start);
        if (end == -1) end = json.length();
        return json.substring(start, end).trim();
    }
}
