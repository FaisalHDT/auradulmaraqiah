package com.daskull.auradulmaraqiyah.model;

public class Alquran {
    private Integer suraId,verseID;
    private String  ayahText, indoText, readText;

    public Alquran() {
    }

    public Alquran(Integer suraId, Integer verseID, String ayahText, String indoText, String readText) {
        this.suraId = suraId;
        this.verseID = verseID;
        this.ayahText = ayahText;
        this.indoText = indoText;
        this.readText = readText;
    }

    public Integer getSuraId() {
        return suraId;
    }

    public void setSuraId(Integer suraId) {
        this.suraId = suraId;
    }

    public Integer getVerseID() {
        return verseID;
    }

    public void setVerseID(Integer verseID) {
        this.verseID = verseID;
    }

    public String getAyahText() {
        return ayahText;
    }

    public void setAyahText(String ayahText) {
        this.ayahText = ayahText;
    }

    public String getIndoText() {
        return indoText;
    }

    public void setIndoText(String indoText) {
        this.indoText = indoText;
    }

    public String getReadText() {
        return readText;
    }

    public void setReadText(String readText) {
        this.readText = readText;
    }
}
