package com.lomboktech.javafundamental.javabasic;

import com.lomboktech.javafundamental.javabasic.kendaraan.Kereta;
import com.lomboktech.javafundamental.javabasic.kendaraan.Mobil;
import com.lomboktech.javafundamental.javabasic.kendaraan.Motor;
import com.lomboktech.javafundamental.javabasic.music.Gitar;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");

        Gitar.bunyi();

        Mobil.jumlahBan();
        Motor.banMotor();
        Kereta.banKereta();

        Date today = new Date();
        System.out.println("Hari ini = "+ today);
        Date tomorrow = new Date();
        System.out.println("Besok hari = " +tomorrow);
    }
}
