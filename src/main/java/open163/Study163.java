package open163;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Study163 {

    public static void main(String[] args) {
        Document document = null;
        try {
            document = Jsoup.connect("http://open.163.com/movie/2019/1/F/V/ME5EDA7G1_ME5EDSCFV.html").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert document != null;
        Elements elements = document.getElementsByClass("f-c6");
        int cnt = 1;
        for (Element element : elements) {
            String href = element.attr("href");
            String text = element.text();
            if (href != null && !href.equals("") && text.contains("中国人民大学")) {
                System.out.println(href);
                System.out.println("第"+(++cnt)+"课 "+text);
            }

        }
    }

}
