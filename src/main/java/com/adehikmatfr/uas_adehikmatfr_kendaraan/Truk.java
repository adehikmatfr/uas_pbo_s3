/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adehikmatfr.uas_adehikmatfr_kendaraan;

/**
 *
 * @author Administrator
 */
public class Truk extends MobilBerat {
    private String nama_barang;
    
    public Truk(String nama, String jenis, String merek, int jumlah_roda, float kecepatan, float kapasitas, String nama_barang) {
        super(nama, jenis, merek, jumlah_roda, kecepatan, kapasitas);
        this.nama_barang = nama_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }
    
     @Override
    public String info() {
        return super.info() + ", Angkut Barang : " + this.getNama_barang();
    }
}
