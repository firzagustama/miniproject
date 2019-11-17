package com.mindorks.framework.mvp.data.network.model;

public class Angsuran {
    Integer urlPhoto;
    String id;
    String item;

    public Angsuran(Integer urlPhoto, String id, String item) {
        this.urlPhoto = urlPhoto;
        this.id = id;
        this.item = item;
    }

    public Integer getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(Integer urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
