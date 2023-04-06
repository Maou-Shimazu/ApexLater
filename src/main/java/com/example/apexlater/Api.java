package com.example.apexlater;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api {
    private static class PlayerInformation {
        //"https://api.mozambiquehe.re/bridge?auth=fcc12b3ec20aec66564be8a7d9dd83b9&player=Maou_Shimaxu&platform=PC"
        private static final String api_key = "fcc12b3ec20aec66564be8a7d9dd83b9";
        private static String username;
        private static String platform;
        public static void requestInformation() throws URISyntaxException, IOException, InterruptedException {
            HttpRequest getRequest = HttpRequest.newBuilder()
                    .uri(new URI("https://api.mozambiquehe.re/bridge?auth=" + api_key + "&player=" + username + "&platform=" + platform))
//                    .header("TRN-Api-Key", api_key)
//                    .header("Accept", "application/json")
                    .GET().build();

            HttpClient httpClient = HttpClient.newHttpClient();
            HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
            // System.out.println(getResponse.body());
            // turn to gson object of type information
        }
    }

}
