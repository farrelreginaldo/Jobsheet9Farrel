/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;

import java.util.Scanner;

/**
 *
 * @author Farrel
 */
public class Latihan4 {
    public static int kecepatan(int j, int w) 
        { 
            int hsl = j/w;
            return hsl;
        }
public static void main(String[] args) {
    Scanner kec = new Scanner(System.in);
    
    System.out.print("Masukkan jarak :");
    int jarak = kec.nextInt();
    
    System.out.print("Masukkan waktu :");
    int waktu = kec.nextInt();
    
    double hasil;
    hasil = kecepatan(jarak, waktu);
    System.out.println("Kecepatan : " + hasil + "km/jam");
}
}


