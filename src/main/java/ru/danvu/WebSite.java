package ru.danvu;

public class WebSite {

    // поля класса или свойства класса
    String URL;
    int viewCount;
    boolean isNewsSite;

    public WebSite(String URL, boolean isNewsSite) {
        this.URL = URL;
        this.isNewsSite = isNewsSite;
    }


    void setViewCount(int count) {
        this.viewCount = count;

    }

    boolean isThisSiteIsNews() {
        System.out.println("!!!!!");
        return isNewsSite;
    }

    WebSite open() {
        System.out.println("Opened");
        return this;
    }
}

