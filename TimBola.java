/**
 * Created by acer on 10/06/2015.
 */
package com.company;

public class TimBola {
    private String maskot;
    private String seragam;
    private String negara;
    private Pemain posisi;

    public TimBola(String maskot, String seragam, String negara, Pemain posisi) {
        this.maskot = maskot;
        this.seragam = seragam;
        this.negara = negara;
        this.posisi = posisi;
    }

    public TimBola(String seragam, String negara, Pemain posisi) {
        this.seragam = seragam;
        this.negara = negara;
        this.posisi = posisi;
    }

    public String getMaskot() {
        return maskot;
    }

    public void setMaskot(String maskot) {
        this.maskot = maskot;
    }

    public String getSeragam() {
        return seragam;
    }

    public void setSeragam(String seragam) {
        this.seragam = seragam;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public Pemain getPosisi() {
        return posisi;
    }

    public void setPosisi(Pemain posisi) {
        this.posisi = posisi;
    }

    @Override
    public String toString() {
        return "TimBola{" +
                "maskot='" + maskot + '\'' +
                ", seragam='" + seragam + '\'' +
                ", negara='" + negara + '\'' +
                ", posisi=" + posisi +
                '}';
    }
}
