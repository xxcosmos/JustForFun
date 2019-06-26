package smms;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import utils.request.GetARestTemplate;

import java.io.File;
import java.util.Collections;

public class UploadImg {

    public static void main(String[] args) {
        RestTemplate restTemplate = GetARestTemplate.getInstance();
        String uploadURL = "https://sm.ms/api/upload";
        String filePath = "/Users/xiaoyuu/IdeaProjects/JustForFun/src/main/resources/upload.jpg";
        FileSystemResource resource = new FileSystemResource(new File(filePath));
        MultiValueMap<String,Object> map = new LinkedMultiValueMap<String, Object>();
        map.add("smfile",resource);
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.ALL));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
       // HttpEntity<String> entity = new HttpEntity<String>("parameters");

        HttpEntity<MultiValueMap<String,Object>> httpEntity = new HttpEntity<MultiValueMap<String, Object>>(map,headers);

        Response data = restTemplate.postForObject(uploadURL,httpEntity,Response.class);
        System.out.println(data);
    }
}
