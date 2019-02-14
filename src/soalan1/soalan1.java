/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalan1;

/**
 *
 * @author pc 10
 */
import java.util.Scanner;
public class soalan1 {
    public static void main(String[] args){
        
        int nombor1 = (int)(Math.random()* 20) + 1;
        int nombor2 = (int)(Math.random()* 20) + 1;
        int kerja = (int)(Math.random()*4) + 1;
        String operasi = null;
        String ulas=null;
        
        int hasil=0;
        if (kerja == 1){
            operasi="+";
            ulas="tambah";
            hasil=nombor1+nombor2;
        }
        if (kerja == 2){
            operasi="-";
            ulas="tolak";
            hasil=nombor1-nombor2;
        }
        if (kerja == 3){
            operasi="*";
            ulas="darab";
            hasil=nombor1*nombor2;
        }
        if (kerja == 4){
            operasi="/";
            ulas="bahagi";
            hasil=nombor1/nombor2;
        }
        
        System.out.print("Soalan rawak adalah "+ulas+" :\n"+nombor1+operasi+nombor2+" = ");
        
       Scanner input = new Scanner(System.in);
       int jawapan=input.nextInt();
       
       if(hasil==jawapan)
           System.out.println("Jawapan anda betul");
       else
           System.out.println("Maaf Jawapan anda salah");
    }       
}
