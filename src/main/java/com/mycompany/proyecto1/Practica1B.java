/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

/**
 *
 * @author Paola y Jaime
 */
/*import java.util.Scanner;*/

 import java.io.InputStream;

class MiScanner {

    public MiScanner(InputStream in) {
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public long nextLong() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

public class Practica1B {
    public static void main(String[] args) {
        MiScanner sc = new MiScanner(System.in);
        System.out.print("Ingrese un número: ");

        try {
            long n = sc.nextLong();
            System.out.println(n + " puede ser almacenado en:");

            if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                System.out.println("(*) byte");
            }
            if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                System.out.println("(*) short");
            }
            if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                System.out.println("(*) int");
            }
            if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                System.out.println("(*) long");
            }

            if (!(n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) &&
                !(n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) &&
                !(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) &&
                !(n >= Long.MIN_VALUE && n <= Long.MAX_VALUE)) {
                System.out.println(n + " no se puede almacenar en ningún tipo de dato primitivo.");
            }

        } catch (Exception e) {
            System.out.println("Entrada no válida. Debe ingresar un número entero.");
        } finally {
            sc.close();
        }
    }
}
   

    

