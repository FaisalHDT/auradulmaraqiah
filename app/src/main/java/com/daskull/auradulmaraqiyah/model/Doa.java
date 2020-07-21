package com.daskull.auradulmaraqiyah.model;

public class Doa {
    private String title;
    private String ayat;
    private String arti;

    public Doa() {
    }

    public Doa(String title, String ayat, String arti) {
        this.title = title;
        this.ayat = ayat;
        this.arti = arti;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }

    public String getArti() {
        return arti;
    }

    public void setArti(String arti) {
        this.arti = arti;
    }
}
