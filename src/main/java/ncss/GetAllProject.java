package ncss;

import org.springframework.web.client.RestTemplate;
import utils.request.GetARestTemplate;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GetAllProject {
    public static final String BASE_URL = "https://cy.ncss.org.cn/search/projectlist?name=&industryCode=&wasBindUniTechnology=-9&investStageCode=&provinceCode=";
    public static final int PROJECT_NUM = 592896;
    public static final String PATH_NAME = "/Users/xiaoyuu/IdeaProjects/JustForFun/src/main/resources/xxx.txt";

    static void getProject() throws IOException {
        int pageSize = 1000;
        File file = new File(PATH_NAME);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("");
        for (int i = 0; i < (PROJECT_NUM / pageSize) + 1; i++) {
            String listUrl = BASE_URL + "&pageIndex=" + i + "&pageSize=" + pageSize;
            RestTemplate restTemplate = GetARestTemplate.getInstance();
            String response = restTemplate.getForObject(listUrl, String.class);
            fileWriter.append(response);
        }
        fileWriter.close();
    }

    public static void main(String[] args) {
        try {
            getProject();
//            file file = new file(PATH_NAME);
//            FileWriter fileWriter = new FileWriter(file);
//            fileWriter.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
