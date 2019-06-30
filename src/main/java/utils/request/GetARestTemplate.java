package utils.request;

import org.springframework.web.client.RestTemplate;

public class GetARestTemplate {

    public static RestTemplate getInstance() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MyMappingJackson2HttpMessageConverter());
        return restTemplate;
    }
}
