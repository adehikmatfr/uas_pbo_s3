/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adehikmatfr.uas_adehikmatfr_kendaraan;

/**
 *
 * @author Administrator
 */
public class MobilBerat extends Kendaraan {

    private float kapasitas;

    public MobilBerat(String nama, String jenis, String merek, int jumlah_roda, float kecepatan, float kapasitas) {
        super(nama, jenis, merek, jumlah_roda, kecepatan);
        this.kapasitas = kapasitas;
    }

    public float getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(float kapasitas) {
        this.kapasitas = kapasitas;
    }

    @Override
    public String info() {
        return super.info() + ", Kapasitas : " + this.getKapasitas() + " ton";
    }
}
