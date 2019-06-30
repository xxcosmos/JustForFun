package utils.request;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-06-30 16:00
 */
public class Header {
    private static final String USER_AGENT = "Mozilla/5.0 (iPhone; CPU iPhone OS 9_1 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Version/9.0 Mobile/13B143 Safari/601.1";

    public static HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("user-agent", USER_AGENT);
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        return headers;
    }
}
