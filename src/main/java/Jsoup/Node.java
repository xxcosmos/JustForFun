package Jsoup;

public class Node {
    String image;
    String name;
    String introduction;
    String field;
    String local;
    String isCompany;
    String status;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Node{" +
                "image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", introduction='" + introduction + '\'' +
                ", field='" + field + '\'' +
                ", local='" + local + '\'' +
                ", isCompany='" + isCompany + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getIsCompany() {
        return isCompany;
    }

    public void setIsCompany(String isCompany) {
        this.isCompany = isCompany;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
