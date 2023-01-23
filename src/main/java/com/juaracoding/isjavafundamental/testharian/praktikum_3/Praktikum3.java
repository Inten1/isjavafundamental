package com.juaracoding.isjavafundamental.testharian.praktikum_3;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author dell a.k.a. Inten Sumunar
Java Developer
Created on 23/01/2023 14:51
@Last Modified 23/01/2023 14:51
Version 1.1
*/
import java.util.Scanner;
public class Praktikum3 {
    /*
	    Soal Nomor 1 Praktikum 3 Java Fundamental
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menit, detik, konversi;

        System.out.print("Masukkan jumlah detik :  ");
        konversi = input.nextInt();

        menit   = (konversi%3600)/60;
        detik   = (konversi%3600)%60;

        System.out.println(konversi+" detik sama dengan "+menit+" menit, "+detik+" detik");
    }
}


