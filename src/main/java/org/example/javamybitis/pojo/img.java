package org.example.javamybitis.pojo;

public class img {
    private int id;
    private String imgUrl;
    private String title;

    public img() {
    }

    public img(int id, String imgUrl, String title) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.title = title;
    }

    public img(String imgUrl,String title) {
        this.imgUrl = imgUrl;
        this.title = title;
    }

    public img(int id, String imgUrl) {
        this.id = id;
        this.imgUrl = imgUrl;
    }

    public String getimgUrl() {
        return imgUrl;
    }

    public void setimgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "img{" +
                "id=" + id +
                ", imgUrl='" + imgUrl + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
