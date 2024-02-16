/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adehikmatfr.uas_adehikmatfr_kendaraan;

/**
 *
 * @author Administrator
 */
public class Bus extends MobilBerat {

    private String rute;

    public Bus(String nama, String jenis, String merek, int jumlah_roda, float kecepatan, float kapasitas, String rute) {
        super(nama, jenis, merek, jumlah_roda, kecepatan, kapasitas);
        this.rute = rute;
    }

    public String getRute() {
        return rute;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }

    @Override
    public String info() {
        return super.info() + ", Rute : " + this.getRute();
    }
}
