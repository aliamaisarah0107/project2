/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corakSegiTiga;

/**
 *
 * @author pc 10
 */
public class corakSegiTiga {
   public static void main(String args[]){
       char aksara = (char)(Math.random() * 26 + 'A');
       
       int i, j, k=1;
       for(i=0; i<10; i++)
       {
           for(j=0; j<k; j++)
           {
           System.out.print(aksara);
           }  
           k = k + 1;
           System.out.println();
           } 
   }
}

