package utils;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.ArrayList;
import java.util.List;

class MyMappingJackson2HttpMessageConverter extends MappingJackson2HttpMessageConverter {
    MyMappingJackson2HttpMessageConverter(){
        List<MediaType> mediaTypes = new ArrayList<MediaType>();
        mediaTypes.add(MediaType.ALL);
        setSupportedMediaTypes(mediaTypes);
    }
}
