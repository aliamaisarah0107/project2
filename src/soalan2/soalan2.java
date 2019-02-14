/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalan2;

/**
 *
 * @author pc 10
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

 public class soalan2
{
      public static void main(String  args[])
      {
            
         int a = 1 + (int)(Math.random()*10);
         int guess = 0;
         int count= 0;
         
         while(guess != a)
         {
             
             guess = Integer.parseInt(JOptionPane.showInputDialog("TEKA NOMBOR ANTARA 1 HINGGA 9 !!! \nMasukkan Nombor Tekaan Anda"));
              count++;
              if (guess > a)
              { 
               JOptionPane.showMessageDialog(null,"Nombor ke bawah sedikit!");
              }
                else if (guess < a)
               {
                JOptionPane.showMessageDialog(null,"Nombor ke depan lagi!");           
                           }
               }
                JOptionPane.showMessageDialog(null,"TAHNIAH !!!. \nTekaan nombor anda tepat dengan " +count+ " cubaan");
              }
        }
    
    

