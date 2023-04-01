package com.example.apexlater;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api {
    private static final String api_key = "f7819513-3aad-4150-8556-828c5991240d";
    private String username;
    private String platform;
    public static void requestInformation() throws URISyntaxException, IOException, InterruptedException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("https://public-api.tracker.gg/v2/apex/standard/profile/origin/Wolf_Stiker"))
                .header("TRN-Api-Key", api_key)
                .header("Accept", "application/json")
                .GET().build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
        // System.out.println(getResponse.body());
        // turn to gson object of type information
    }
}
