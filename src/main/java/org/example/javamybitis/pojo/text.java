package org.example.javamybitis.pojo;

public class text {
    private int id;
    private String username;
    private String tittle;
    private String content;
    private int count;

    public text() {
    }

    public text(int id) {
        this.id = id;
    }

    public text(int id, String username, String tittle, String content, int count) {
        this.id = id;
        this.username = username;
        this.tittle = tittle;
        this.content = content;
        this.count = count;
    }

    public text(String username, String tittle, String content, int count) {
        this.username = username;
        this.tittle = tittle;
        this.content = content;
        this.count = count;
    }

    public text(int id, String username, String tittle, String content) {
        this.id = id;
        this.username = username;
        this.tittle = tittle;
        this.content = content;
    }

    public text(String username, String tittle, String content) {
        this.username = username;
        this.tittle = tittle;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "text{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", tittle='" + tittle + '\'' +
                ", content='" + content + '\'' +
                ", count=" + count +
                '}';
    }
}
