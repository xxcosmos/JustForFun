package file;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void createDir(String pathName, String studentId) {
        File file = new File(pathName);
        if (!file.exists()) {
            file.mkdirs();
        }
        File picture = new File(pathName + "/" + studentId + ".jpg");
        if (picture.exists())
            return;
        else {
            try {
                picture.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {
        String s = "201713137042";
        System.out.println(s.substring(4, 6));
        //createDir("/Users/xiaoyuu/IdeaProjects/JustForFun/src/main/resources/2017/13/137","201713137042");
    }
}
