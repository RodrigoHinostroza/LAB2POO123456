/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1;

import java.util.Scanner;

public class Proyecto1 {

    private static String n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");

        try {
            long n = scanner.nextLong();
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
            System.out.println("(*) long");
        } catch (Exception e) {
            System.out.println(n + " no se puede almacenar en ningún tipo de dato primitivo.");
        } finally {
            scanner.close();
        }
    }
}


        
    
    
            
        
    

