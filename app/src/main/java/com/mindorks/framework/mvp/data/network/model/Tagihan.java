package com.mindorks.framework.mvp.data.network.model;

public class Tagihan {
    Integer bulan;
    String tanggal;
    Integer amount;
    Boolean isPaid;
    Boolean payNow;

    public Tagihan(Integer bulan, String tanggal, Integer amount, Boolean isPaid, Boolean payNow) {
        this.bulan = bulan;
        this.tanggal = tanggal;
        this.amount = amount;
        this.isPaid = isPaid;
        this.payNow = payNow;
    }

    public Integer getBulan() {
        return bulan;
    }

    public void setBulan(Integer bulan) {
        this.bulan = bulan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    public Boolean getPayNow() {
        return payNow;
    }

    public void setPayNow(Boolean payNow) {
        this.payNow = payNow;
    }
}
