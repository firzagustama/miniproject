package com.mindorks.framework.mvp.data.network.model;

public class Metode {
    Integer gambar;
    String nama;

    public Metode(Integer gambar, String nama) {
        this.gambar = gambar;
        this.nama = nama;
    }

    public Integer getGambar() {
        return gambar;
    }

    public void setGambar(Integer gambar) {
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
