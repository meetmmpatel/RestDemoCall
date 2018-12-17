package com.example.restdemocall.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class UsStateController {

    // RestTemplate
    RestTemplate restTemplate = new RestTemplate();

    // HttpHeaders
    HttpHeaders headers = new HttpHeaders();
    String URL_US = "http://services.groupkt.com/state/get/USA/all";


    @GetMapping("usa/states")
    public String getAllStates(){

        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));

        // Request to return JSON format
        headers.setContentType(MediaType.APPLICATION_JSON);

        // HttpEntity<String>: To get result as String.
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        // Send request with GET method, and Headers.
        ResponseEntity<String> response =
                restTemplate.exchange(URL_US,HttpMethod.GET, entity, String.class);

        String result = response.getBody();
        return result;

    }

    @GetMapping("usa/states/{abbr}")
    public String getOneState(@PathVariable String abbr){
        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));

        // Request to return JSON format
        headers.setContentType(MediaType.APPLICATION_JSON);

        // HttpEntity<String>: To get result as String.
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        String URL_US_State = "http://services.groupkt.com/state/get/USA/" + abbr;
        ResponseEntity<String> response =
                restTemplate.exchange(URL_US_State,HttpMethod.GET, entity, String.class);
        String result = response.getBody();
        return result;

    }

}
