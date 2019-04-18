package SMMS;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UploadImg {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String uploadURL = "https://sm.ms/api/upload";
        String filePath = "/Users/xiaoyuu/IdeaProjects/JustForFun/src/main/resources/upload.jpg";
        File file = new File(filePath);
        FileSystemResource resource = new FileSystemResource(file);
        MultiValueMap<String,Object> map = new LinkedMultiValueMap<String, Object>();
        map.add("smfile",resource);
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
       // HttpEntity<String> entity = new HttpEntity<String>("parameters");

        HttpEntity<MultiValueMap<String,Object>> httpEntity = new HttpEntity<MultiValueMap<String, Object>>(map,headers);

        SMMSRespnseData data = restTemplate.postForObject(uploadURL,httpEntity,SMMSRespnseData.class);
        System.out.println(data);
    }
}
