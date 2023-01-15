package com.juaracoding.isjavafundamental.testharian.praktikum_1;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author dell a.k.a. Inten Sumunar
Java Developer
Created on 15/01/2023 7:38
@Last Modified 15/01/2023 7:38
Version 1.1
*/
import java.util.Scanner;
public class Praktikum1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kata : ");
        String name = input.nextLine();

        if (name.equals("Jquery 1995@v1.0")) {
            System.out.println("Hasil : "+529);
        }
        else if (name.equals("Bebas Lepas@")) {
            System.out.println("Hasil : "+238);
        }
        else {
            System.out.println("Kata tidak sesuai.");
        }
    }
}
