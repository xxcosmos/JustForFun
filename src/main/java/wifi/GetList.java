package wifi;

import cn.hutool.core.io.FileUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.util.List;

public class GetList {

    public static void getList() {
        String filePath = "/Users/xiaoyuu/Downloads/password.xlsx";
        ExcelReader reader = ExcelUtil.getReader(filePath);
        List<Bean> beans = reader.readAll(Bean.class);
        System.out.println("[");
        for (Bean bean : beans) {
            JSON parse = JSONUtil.parse(bean);
            System.out.println(parse.toString() + ",");

        }
        System.out.println("]");
    }

    public static void modify() {
        String json = "hello world";
        JSONArray objects = JSONUtil.parseArray(json);
        List<Bean> beans = JSONUtil.toList(objects, Bean.class);
        System.out.println("[");

        for (Bean bean : beans) {
            bean.setPwd(bean.getPwd().substring(6, 14));
            System.out.println(JSONUtil.toJsonStr(bean) + ",");
        }
        System.out.println("]");

    }

    public static void main(String[] args) {
        modify();
    }

}
