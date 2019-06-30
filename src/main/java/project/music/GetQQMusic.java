package project.music;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import utils.request.GetARestTemplate;
import utils.request.Header;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-06-30 15:42
 */
public class GetQQMusic {

    public static final String json = "{\n" +
            "    \"code\": 0,\n" +
            "    \"data\": {\n" +
            "        \"keyword\": \"孙燕姿\",\n" +
            "        \"priority\": 0,\n" +
            "        \"qc\": [],\n" +
            "        \"semantic\": {\n" +
            "            \"curnum\": 0,\n" +
            "            \"curpage\": 1,\n" +
            "            \"list\": [],\n" +
            "            \"totalnum\": 0\n" +
            "        },\n" +
            "        \"song\": {\n" +
            "            \"curnum\": 2,\n" +
            "            \"curpage\": 1,\n" +
            "            \"list\": [\n" +
            "                {\n" +
            "                    \"albumid\": 586,\n" +
            "                    \"albummid\": \"002ehzTm0TxXC2\",\n" +
            "                    \"albumname\": \"The Moment\",\n" +
            "                    \"albumname_hilight\": \"The Moment\",\n" +
            "                    \"alertid\": 2,\n" +
            "                    \"chinesesinger\": 0,\n" +
            "                    \"docid\": \"1817637833396393704\",\n" +
            "                    \"grp\": [],\n" +
            "                    \"interval\": 210,\n" +
            "                    \"isonly\": 1,\n" +
            "                    \"lyric\": \"《向左走，向右走》电影主题曲\",\n" +
            "                    \"lyric_hilight\": \"《向左走，向右走》电影主题曲\",\n" +
            "                    \"msgid\": 14,\n" +
            "                    \"nt\": 288523180,\n" +
            "                    \"pay\": {\n" +
            "                        \"payalbum\": 0,\n" +
            "                        \"payalbumprice\": 0,\n" +
            "                        \"paydownload\": 1,\n" +
            "                        \"payinfo\": 1,\n" +
            "                        \"payplay\": 0,\n" +
            "                        \"paytrackmouth\": 1,\n" +
            "                        \"paytrackprice\": 200\n" +
            "                    },\n" +
            "                    \"preview\": {\n" +
            "                        \"trybegin\": 74568,\n" +
            "                        \"tryend\": 95964,\n" +
            "                        \"trysize\": 0\n" +
            "                    },\n" +
            "                    \"pubtime\": 1061481600,\n" +
            "                    \"pure\": 0,\n" +
            "                    \"singer\": [\n" +
            "                        {\n" +
            "                            \"id\": 109,\n" +
            "                            \"mid\": \"001pWERg3vFgg8\",\n" +
            "                            \"name\": \"孙燕姿\",\n" +
            "                            \"name_hilight\": \"<span class=\\\"c_tx_highlight\\\">孙燕姿</span>\"\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"size128\": 3371223,\n" +
            "                    \"size320\": 8450450,\n" +
            "                    \"sizeape\": 18846919,\n" +
            "                    \"sizeflac\": 20267048,\n" +
            "                    \"sizeogg\": 4672865,\n" +
            "                    \"songid\": 8145,\n" +
            "                    \"songmid\": \"001xJbdb2MBaaz\",\n" +
            "                    \"songname\": \"遇见\",\n" +
            "                    \"songname_hilight\": \"遇见\",\n" +
            "                    \"stream\": 1,\n" +
            "                    \"switch\": 636675,\n" +
            "                    \"t\": 1,\n" +
            "                    \"tag\": 0,\n" +
            "                    \"type\": 0,\n" +
            "                    \"ver\": 0,\n" +
            "                    \"vid\": \"\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"albumid\": 15902,\n" +
            "                    \"albummid\": \"000P3l050Olt27\",\n" +
            "                    \"albumname\": \"逆光\",\n" +
            "                    \"albumname_hilight\": \"逆光\",\n" +
            "                    \"alertid\": 2,\n" +
            "                    \"chinesesinger\": 0,\n" +
            "                    \"docid\": \"13493307981491741242\",\n" +
            "                    \"grp\": [],\n" +
            "                    \"interval\": 289,\n" +
            "                    \"isonly\": 1,\n" +
            "                    \"lyric\": \"《第二回合我爱你（幸运日)》电视剧主题曲\",\n" +
            "                    \"lyric_hilight\": \"《第二回合我爱你（幸运日)》电视剧主题曲\",\n" +
            "                    \"msgid\": 14,\n" +
            "                    \"nt\": 466565480,\n" +
            "                    \"pay\": {\n" +
            "                        \"payalbum\": 0,\n" +
            "                        \"payalbumprice\": 0,\n" +
            "                        \"paydownload\": 1,\n" +
            "                        \"payinfo\": 1,\n" +
            "                        \"payplay\": 0,\n" +
            "                        \"paytrackmouth\": 1,\n" +
            "                        \"paytrackprice\": 200\n" +
            "                    },\n" +
            "                    \"preview\": {\n" +
            "                        \"trybegin\": 71275,\n" +
            "                        \"tryend\": 106738,\n" +
            "                        \"trysize\": 0\n" +
            "                    },\n" +
            "                    \"pubtime\": 1174492800,\n" +
            "                    \"pure\": 0,\n" +
            "                    \"singer\": [\n" +
            "                        {\n" +
            "                            \"id\": 109,\n" +
            "                            \"mid\": \"001pWERg3vFgg8\",\n" +
            "                            \"name\": \"孙燕姿\",\n" +
            "                            \"name_hilight\": \"<span class=\\\"c_tx_highlight\\\">孙燕姿</span>\"\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"size128\": 4626166,\n" +
            "                    \"size320\": 11565124,\n" +
            "                    \"sizeape\": 29767497,\n" +
            "                    \"sizeflac\": 29965592,\n" +
            "                    \"sizeogg\": 6295508,\n" +
            "                    \"songid\": 5211338,\n" +
            "                    \"songmid\": \"000BO3xy4fd8BJ\",\n" +
            "                    \"songname\": \"我怀念的\",\n" +
            "                    \"songname_hilight\": \"我怀念的\",\n" +
            "                    \"stream\": 1,\n" +
            "                    \"switch\": 636675,\n" +
            "                    \"t\": 1,\n" +
            "                    \"tag\": 0,\n" +
            "                    \"type\": 0,\n" +
            "                    \"ver\": 0,\n" +
            "                    \"vid\": \"\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"totalnum\": 400\n" +
            "        },\n" +
            "        \"totaltime\": 0,\n" +
            "        \"zhida\": {\n" +
            "            \"chinesesinger\": 0,\n" +
            "            \"type\": 0\n" +
            "        }\n" +
            "    },\n" +
            "    \"message\": \"\",\n" +
            "    \"notice\": \"\",\n" +
            "    \"subcode\": 0,\n" +
            "    \"time\": 1561883839,\n" +
            "    \"tips\": \"\"\n" +
            "}";

    public static void main(String[] args) {
//    search("孙燕姿",1,10);
        test();
    }

    public static void search(String keyword, int page, int num) {
        RestTemplate restTemplate = GetARestTemplate.getInstance();
        HttpHeaders headers = Header.getHeaders();
        headers.set("referer", "http://m.y.qq.com");
        HttpEntity<String> requestEntity = new HttpEntity<String>(null, headers);
        ResponseEntity<Object> responseEntity = restTemplate.exchange(Constant.QQ_QUERY_URL, HttpMethod.GET, requestEntity, Object.class, getSearchBody(keyword, page, num));
        JSONObject jsonObject = JSONUtil.parseObj(responseEntity.getBody());
    }

    public static Map<String, Object> getSearchBody(String keyword, int page, int num) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("w", keyword);
        map.put("p", page);
        map.put("n", num);
        return map;

    }

    public static void test() {
        JSONObject jsonObject = JSONUtil.parseObj(json);
        JSONArray list = jsonObject.getJSONArray("list");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
