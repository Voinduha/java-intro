package ru.danvu;

public class Main {
    // простые типы данных

    boolean aBoolean = true;
    char aChar = 'c';

    // Целочисленные типы
    byte aByte = 1;
    short aShort = 5;
    int anInt = 12;
    long aLong = 4;

    // Типы с плавающей точкой, арифметика для них не точная
    float aFloat = 0.15f;
    double aDouble = 0.15;

    // Самый часто используемый тип данных (объектный или ссылочный) в любой программе
    String aString = "Hello";

    public static void main(String[] args) {

        WebSite newSite = new WebSite("yandex.ru/news", true);
        WebSite ytSite = new WebSite("youtube.com", false);


        newSite.setViewCount(10);
        newSite.open();
        ytSite.open();

        newSite.printItems();
        //  newSite.open().setViewCount(1);


        boolean isSiteNews = newSite.isThisSiteIsNews();
        System.out.println(isSiteNews);
        System.out.println(newSite.viewCount);
        System.out.println(ytSite.viewCount);
    }
}
