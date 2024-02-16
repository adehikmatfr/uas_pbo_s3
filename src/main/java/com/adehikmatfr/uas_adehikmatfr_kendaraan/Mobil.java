/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adehikmatfr.uas_adehikmatfr_kendaraan;

/**
 *
 * @author Administrator
 */
public class Mobil extends Kendaraan {

    private int jumlah_kursi;

    public Mobil(String nama, String jenis, String merek, int jumlah_roda, float kecepatan, int jumlah_kursi) {
        super(nama, jenis, merek, jumlah_roda, kecepatan);
        this.jumlah_kursi = jumlah_kursi;
    }

    public int getJumlah_kursi() {
        return jumlah_kursi;
    }

    public void setJumlah_kursi(int jumlah_kursi) {
        this.jumlah_kursi = jumlah_kursi;
    }

    @Override
    public String info() {
        return super.info() + ", Jumlah Kursi : "+ this.getJumlah_kursi();
    }
}