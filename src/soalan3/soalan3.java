/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalan3;

/**
 *
 * @author pc 10
 */
import java.util.Scanner;
public class soalan3 {
    public static void main(String[] args){
     System.out.println("Masukkan tahun mula: ");
     Scanner input = new Scanner(System.in);
     int mula = input.nextInt();
     System.out.println("Masukkan tahun tamat: ");
     int tamat = input.nextInt();
     
     String tarikh="";
     int tahunMula=mula;
     int tahunTamat=tamat-tahunMula;
         int hari=1+(int)(Math.random() * 31);
         int bulan=1+(int)(Math.random() * 12);
         int tahun= (tahunMula + (int)(Math.random() * tahunTamat));
         
         tarikh= +hari+"/"+bulan+"/"+tahun;
         System.out.println("Tarikh yang bertuah antara tahun "+mula+" hingga tahun "+tamat+"\n adalah pada "+tarikh);
    }
}
