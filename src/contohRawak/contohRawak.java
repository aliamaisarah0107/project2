/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohRawak;

/**
 *
 * @author pc 10
 */
public class contohRawak {
 public static void main(String[] args) {
      
     StringBuilder s = new StringBuilder();
     
     for (int i = 0; i < 3; i++) {
         
         char aksara = (char)(Math.random() * 26 + 'A');
         s.append(aksara);
         
     }
     for (int i = 0; i < 4; i++) {
         
         char nombor = (char)(Math.random() * 10 + '0');
         s.append(nombor);
     }
     
     System.out.println("JANA NOMBOR PENDAFTARAN PELAJAR");
     System.out.println("Nombor pendaftaran pelajar : " + s);
     }
 }   

