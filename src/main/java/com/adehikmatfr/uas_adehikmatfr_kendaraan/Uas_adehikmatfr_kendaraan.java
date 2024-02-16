/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.adehikmatfr.uas_adehikmatfr_kendaraan;

/**
 *
 * @author Administrator
 */
public class Uas_adehikmatfr_kendaraan {

    public static void main(String[] args) {
        // Mobil
        Mobil mobil = new Mobil("Avanza", "Mobil", "Toyota", 4, 100, 7);
        System.out.println(mobil.info());
        // SepedaMotor
        SepedaMotor sepedaMotor = new SepedaMotor("Beat", "Sepeda Motor", "Honda", 2, 60, 110);
        System.out.println(sepedaMotor.info());
        // Truk
        Truk truk = new Truk("Hino", "Truk", "Hino", 6, 80, 10, "Kardus");
        System.out.println(truk.info());
        // Bus
        Bus bus = new Bus("Mercedes", "Bus", "Mercedes-Benz", 6, 70, 15, "Jakarta - Bandung");
        System.out.println(bus.info());
    }
}
