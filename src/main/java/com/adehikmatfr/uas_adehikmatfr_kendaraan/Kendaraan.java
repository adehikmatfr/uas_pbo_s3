/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adehikmatfr.uas_adehikmatfr_kendaraan;

/**
 *
 * @author Administrator
 */
public class Kendaraan {

    public String nama;
    protected String jenis;
    protected String merek;
    protected int jumlah_roda;
    protected float kecepatan;

    public Kendaraan(String nama, String jenis, String merek, int jumlah_roda, float kecepatan) {
        this.nama = nama;
        this.jenis = jenis;
        this.merek = merek;
        this.jumlah_roda = jumlah_roda;
        this.kecepatan = kecepatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getJumlah_roda() {
        return jumlah_roda;
    }

    public void setJumlah_roda(int jumlah_roda) {
        this.jumlah_roda = jumlah_roda;
    }

    public float getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(float kecepatan) {
        this.kecepatan = kecepatan;
    }

    public float hitungWaktuTempuh(float jarak) {
        return jarak / this.kecepatan;
    }

    public String info() {
        return "Nama: " + this.getNama() + ", Jneis: " + this.getJenis() + ", Merk: " + this.getMerek() + ", Jumlah Roda: " + this.getJumlah_roda();
    }
}
