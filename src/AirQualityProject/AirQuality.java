package AirQualityProject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class AirQuality {
    public static void healthImplication() {
        callAPI();
        AirQuality airQuality = new AirQuality();
        airQuality.healthImplication();

    }

    public static void callAPI(){
                // Define the API endpoint and parameters
                String apiKey = "64961b96c2857c2d4c4da828574bc426\n";
                String lat = "49.30637000";  // Latitude for Paris
                String lon = "8.64236000";   // Longitude for Paris
                String urlString = String.format("https://api.openweathermap.org/data/2.5/air_pollution?lat=%s&lon=%s&appid=%s", lat, lon, apiKey);

                try {
                    // Create a URL object
                    URL url = new URL(urlString);

                    // Open an HTTP connection
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");

                    // Check the response code
                    int responseCode = connection.getResponseCode();
                    if (responseCode == 200) { // HTTP OK
                        // Read the response
                        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                        StringBuilder response = new StringBuilder();
                        String line;

                        while ((line = in.readLine()) != null) {
                            response.append(line);
                        }

                        // Close the reader
                        in.close();

                        // Print the JSON response
                        System.out.println("Air Quality Data:");
                        System.out.println(response.toString());
                    } else {
                        System.out.println("Error: Received HTTP response code " + responseCode);
                    }

                    // Disconnect the connection
                    connection.disconnect();
                } catch (Exception e) {
                    e.printStackTrace();
                }

    }
}

enum Quality {
    GOOD,
    MODERATE,
    UNHEALTHY_FOR_SENSITIVE_GROUPS,
    UNHEALTHY,
    VERY_UNHEALTHY,
    HAZARDOUES
}
