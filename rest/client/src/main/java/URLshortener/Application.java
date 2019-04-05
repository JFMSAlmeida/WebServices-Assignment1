package URLshortener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.HttpClientErrorException;

@SpringBootApplication
public class Application {


    private static String ENDPOINT = "http://localhost:8080/";
    public static void main(String[] args) {

        try{
            String result1 = restTemplate.postForObject(ENDPOINT + "?url=www.facebook.com");
            System.out.println(result);

            String result2 = restTemplate.postForObject(ENDPOINT + "?url=www.youtube.com");
            System.out.println(result);

            String result3 = restTemplate.postForObject(ENDPOINT + "?url=www.google.com");
            System.out.println(result);

            String result4 = restTemplate.getforObject(ENDPOINT + "id?id=" + Integer.parseInt(result1));



        } catch (HttpClientErrorException e) {

        }

    }
}