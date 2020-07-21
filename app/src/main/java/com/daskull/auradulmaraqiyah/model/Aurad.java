package com.daskull.auradulmaraqiyah.model;

public class Aurad {

    private String ayat;
    private String artinya;

    public Aurad() {
    }

    public Aurad(String ayat, String artinya) {
        this.ayat = ayat;
        this.artinya = artinya;
    }

    public String getAyat() {
        return ayat;
    }

    public String getArtinya() {
        return artinya;
    }
}
