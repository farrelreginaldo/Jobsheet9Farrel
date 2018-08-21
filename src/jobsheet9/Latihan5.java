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
public class Latihan5 {
    public static int tersar(int I, int II, int III, int hsl) {
        if(I > II && I > III){
hsl=I;
}
else if(II > I && II > I){
    hsl=II;
}
else{
            hsl=III;
}
        return hsl;
    }
    public static void main(String[] args) {
    Scanner big = new Scanner(System.in);
    
        System.out.print("Masukkan bilangan I : ");
        int Is = big.nextInt();
        System.out.print("Masukkan bilangan II : ");
        int IIs = big.nextInt();
        System.out.print("Masukkan bilangan III : ");
        int IIIs = big.nextInt();
   int hasil = 0;
        System.out.print("Bilangan terbesar adalah " + hasil);

    }

}
