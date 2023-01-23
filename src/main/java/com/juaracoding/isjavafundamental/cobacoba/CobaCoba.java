package com.juaracoding.isjavafundamental.cobacoba;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author dell a.k.a. Inten Sumunar
Java Developer
Created on 13/01/2023 19:05
@Last Modified 13/01/2023 19:05
Version 1.1
*/

import java.util.Random;

public class CobaCoba {
    public static void main(String[] args) {

                for (int i=0; i<1; i++){
                    for (int j=0;j<16; j++){
                        Random r = new Random();
                        char huruf = (char) (r.nextInt(26)+'A');
                        System.out.print(huruf+" ");
                    }
                    System.out.println();
                }
            }
        }
