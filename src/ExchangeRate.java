import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRate {

    public Currency getCurrentExchangeRate(String currencyFrom, String currencyTo) {

        String apiKey = "YOUR API KEY";

        URI serviceURL = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + currencyFrom + "/" + currencyTo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(serviceURL)
                .build();

        HttpResponse<String> response = null;
        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new Gson().fromJson(response.body(), Currency.class);
    }
}
