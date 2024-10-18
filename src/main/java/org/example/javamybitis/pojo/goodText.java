package org.example.javamybitis.pojo;

public class goodText {
    private int id;
    private int textId;

    public goodText() {
    }

    public goodText(int id, int textId) {
        this.id = id;
        this.textId = textId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    @Override
    public String toString() {
        return "goodText{" +
                "id=" + id +
                ", textId=" + textId +
                '}';
    }
}


