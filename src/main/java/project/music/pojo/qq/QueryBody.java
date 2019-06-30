package project.music.pojo.qq;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-06-30 15:48
 */

@Data
public class QueryBody {
    private final int n = 10;
    private final String format = "json";
    /**
     * w keyword
     * p pageNum
     */
    private String w;
    private String p;
}
