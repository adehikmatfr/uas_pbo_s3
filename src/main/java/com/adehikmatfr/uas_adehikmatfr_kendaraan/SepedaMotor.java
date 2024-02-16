/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adehikmatfr.uas_adehikmatfr_kendaraan;

/**
 *
 * @author Administrator
 */
public class SepedaMotor extends Kendaraan {
    private int cc;
   
    public SepedaMotor(String nama, String jenis, String merek, int jumlah_roda, float kecepatan, int cc) {
        super(nama, jenis, merek, jumlah_roda, kecepatan);
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
    
    @Override
    public String info() {
        return super.info() + ", CC : "+ this.getCc();
    }
}
