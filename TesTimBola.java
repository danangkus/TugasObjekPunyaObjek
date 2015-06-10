/**
 * Created by acer on 10/06/2015.
 */
package com.company;

public class TesTimBola {
    public static void main(String[] args) {
        Pemain pertama = new Pemain("Ospina","Koscielny","Ozil","Walcott");
        Pemain kedua = new Pemain("Hart","Kompany","Nasri","Dzeko");

        TimBola arsenal = new TimBola("Meriam","Merah","Inggris",pertama);
        TimBola mancit = new TimBola("Biru","Inggris",kedua);

        System.out.println("Tim 1 : " + arsenal.toString());
        System.out.println("Tim 2 : " + mancit.toString());

        arsenal.setMaskot("Gunnersaurus");
        arsenal.setSeragam("Kuning");
        kedua.setGelandang("Silva");
        System.out.println("\nTim 1 setelah pergantian : " +arsenal.toString());
    }
}
