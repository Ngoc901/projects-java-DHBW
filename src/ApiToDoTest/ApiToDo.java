package ApiToDoTest;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiToDo {
    public static void main(String[] args) {
        try {
            // Replace with your API URL and JWT token
            String apiUrl = "https://atai-mamytov.click/nest24/todo/api/todo/";
            String jwtToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbl90eXBlIjoiYWNjZXNzIiwiZXhwIjoxNzM3MzE0MzQwLCJpYXQiOjE3MzczMTA3NDAsImp0aSI6IjU5N2VjNTcyYjdjZTRjNDA4NTBhNjZkOTNkMTliN2MwIiwidXNlcl9pZCI6Mn0.vZ0Rbc5JpwKJxSMLNNI7stBgtrpIhIrDPnpUlPnpwx8";

            // Create a new HttpClient
            HttpClient client = HttpClient.newHttpClient();

            // Build the HttpRequest with the Authorization header
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(apiUrl))              // Set the target URI
                    .header("Authorization", "Bearer " + jwtToken)  // Add JWT in the header
                    .GET()                             // Specify GET method
                    .build();                          // Build the HttpRequest

            // Send the request and get the response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Print the response details
            System.out.println("Response Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
