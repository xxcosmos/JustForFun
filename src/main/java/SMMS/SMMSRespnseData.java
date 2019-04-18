package SMMS;

public class SMMSRespnseData {
    private String code;
    private String filename;
    private String storename;
    private int size;
    private int width;
    private int height;
    private String hash;
    private String delete;
    private String url;
    private String path;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "SMMSRespnseData{" +
                "code='" + code + '\'' +
                ", filename='" + filename + '\'' +
                ", storename='" + storename + '\'' +
                ", size=" + size +
                ", width=" + width +
                ", height=" + height +
                ", hash='" + hash + '\'' +
                ", delete='" + delete + '\'' +
                ", url='" + url + '\'' +
                ", path='" + path + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
