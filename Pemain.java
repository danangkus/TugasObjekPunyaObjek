/**
 * Created by acer on 10/06/2015.
 */
package com.company;

public class Pemain {
    private String kiper;
    private String bek;
    private String gelandang;
    private String penyerang;

    public Pemain(String kiper, String bek, String gelandang, String penyerang) {
        this.kiper = kiper;
        this.bek = bek;
        this.gelandang = gelandang;
        this.penyerang = penyerang;
    }

    public Pemain(String kiper, String bek, String gelandang) {
        this.kiper = kiper;
        this.bek = bek;
        this.gelandang = gelandang;
    }

    public String getKiper() {
        return kiper;
    }

    public void setKiper(String kiper) {
        this.kiper = kiper;
    }

    public String getBek() {
        return bek;
    }

    public void setBek(String bek) {
        this.bek = bek;
    }

    public String getGelandang() {
        return gelandang;
    }

    public void setGelandang(String gelandang) {
        this.gelandang = gelandang;
    }

    public String getPenyerang() {
        return penyerang;
    }

    public void setPenyerang(String penyerang) {
        this.penyerang = penyerang;
    }

    @Override
    public String toString() {
        return "Pemain{" +
                "kiper='" + kiper + '\'' +
                ", bek='" + bek + '\'' +
                ", gelandang='" + gelandang + '\'' +
                ", penyerang='" + penyerang + '\'' +
                '}';
    }
}
