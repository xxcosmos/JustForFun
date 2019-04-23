package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;

public class NcssPrase {
    public static final String filePath = "/Users/xiaoyuu/IdeaProjects/JustForFun/src/main/resources/projectlist.htm";

    static void prase() throws IOException {
        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        reader.close();

        String html = stringBuilder.toString();
        System.out.println(html);
        Document document = Jsoup.parse(html);
        Elements tr = document.select("tr[data-link]");
        System.out.println(tr.size());
        for (Element e : tr) {
            Node node = new Node();
            Elements tds = e.getElementsByTag("td");
            System.out.println(tds.size());
            for (int i = 0; i < tds.size(); i++) {
                String text;
                switch (i) {
                    case 0:
                        text = tds.get(i).getElementsByTag("span").get(0).text();
                        node.setName(text);
                        break;
                    case 1:
                        text = tds.get(i).getElementsByTag("div").get(0).text();
                        node.setIntroduction(text);
                        break;
                    case 2:
                        text = tds.get(i).getElementsByTag("span").get(0).text();
                        node.setField(text);
                        break;
                    case 3:
                        text = tds.get(i).text();
                        node.setLocal(text);
                        break;
                    case 4:
                        text = tds.get(i).getElementsByTag("span").get(0).text();
                        node.setIsCompany(text);
                        break;
                    case 5:
                        text = tds.get(i).text();
                        node.setStatus(text);
                        break;
                    default:
                        System.out.println("error");
                }
            }
            System.out.println(node);
        }
    }

    public static void main(String[] args) {
        try {
            prase();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
