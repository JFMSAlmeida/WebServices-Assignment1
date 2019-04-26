package URLshortener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

@SpringBootApplication
public class Application {


    private static String ENDPOINT = "http://localhost:8080/";
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        try{
            String result1 = restTemplate.postForObject(ENDPOINT + "?url=www.facebook.com",null, String.class);
            System.out.println(result1);

            String result2 = restTemplate.postForObject(ENDPOINT + "?url=www.youtube.com",null, String.class);
            System.out.println(result2);

            restTemplate.put(ENDPOINT + "id?id=2",  null);
            System.out.println("put executed");

            String result3 = restTemplate.postForObject(ENDPOINT + "?url=www.google.com",null, String.class);
            System.out.println(result3);

            String result4 = restTemplate.getForObject(ENDPOINT + "id?id=" + Integer.parseInt(result1), String.class);
            System.out.println(result4);

            Set<Integer> result5 = restTemplate.getForObject(ENDPOINT, Set.class);
            System.out.println(result5);

            restTemplate.delete(ENDPOINT + "id?id=0");
            System.out.println("delete executed");

            Set<Integer> result6 = restTemplate.getForObject(ENDPOINT, Set.class);
            System.out.println(result6);

        } catch (HttpClientErrorException e) {
            System.out.println("Error in some remote call");
        }

        try{
            System.out.println("Executing a repeated post request");
            String result7 = restTemplate.postForObject(ENDPOINT + "?url=www.youtube.com",null, String.class);
            System.out.println(result7);

        } catch (HttpClientErrorException e) {
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Executing a get request with an ID that doesn't exist");
            String result8 = restTemplate.getForObject(ENDPOINT + "id?id=100", String.class);
            System.out.println(result8);

        } catch (HttpClientErrorException e) {
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Executing a repeated put request");
            restTemplate.put(ENDPOINT + "id?id=2",  null);
            System.out.println("put executed");

        } catch (HttpClientErrorException e) {
            System.out.println(e.getMessage());
        }


        try{
            System.out.println("Executing a delete request with an ID that doesn't exist");
            restTemplate.delete(ENDPOINT + "id?id=101");

        } catch (HttpClientErrorException e) {
            System.out.println(e.getMessage());
        }

        try {
            restTemplate.delete(ENDPOINT);
            System.out.println("delete all executed");

            Set<Integer> result9 = restTemplate.getForObject(ENDPOINT, Set.class);
            System.out.println(result9);

        } catch (HttpClientErrorException e) {
            System.out.println("Error in some remote call");
        }


    }
}