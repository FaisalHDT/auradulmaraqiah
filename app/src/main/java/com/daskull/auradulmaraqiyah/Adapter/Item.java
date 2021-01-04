package com.daskull.auradulmaraqiyah.Adapter;

public class Item {

    private Integer id, suraId, verseID;
    private String ayahText, indoText, readText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
