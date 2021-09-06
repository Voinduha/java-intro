package ru.danvu;

public class WebSite {

    // поля класса или свойства класса
    String URL;
    int viewCount;
    boolean isNewsSite;
    //масссив
    String[] menuItems = {"Login", "Logout", "Profile"};

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
        if (isNewsSite) {
            System.out.println("Breaking news");
        } else {
            System.out.println("Sad news");
        }
        return this;
    }

    void printItems() {
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(menuItems[i]);

        }

        for (String menuItems : menuItems) {
            System.out.println(menuItems);
        }
    }
}

