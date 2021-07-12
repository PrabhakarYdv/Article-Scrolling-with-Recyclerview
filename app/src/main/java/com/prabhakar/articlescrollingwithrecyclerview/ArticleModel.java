package com.prabhakar.articlescrollingwithrecyclerview;

public class ArticleModel {
    private int image;
    private String author;
    private int icon;
    private String tagText;
    private String line1;
    private String line2;
    private String line3;

    public ArticleModel(int image, String author, int icon, String tagText, String line1, String line2, String line3) {
        this.image = image;
        this.author = author;
        this.icon = icon;
        this.tagText = tagText;
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    public int getImage() {
        return image;
    }

    public String getAuthor() {
        return author;
    }

    public int getIcon() {
        return icon;
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getLine3() {
        return line3;
    }

    public String getTagText() {
        return tagText;
    }
}
