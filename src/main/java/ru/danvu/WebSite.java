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

    public WebSite() {
    }
}
