/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list6;

import javax.swing.JOptionPane;

/**
 *
 * @author stranger
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try{
              
        int[] ex = new int[10];
        for(int i=0;i<ex.length;i++){
            ex[i]=i;
        }
        
        for(int i=0;i<=ex.length;i++){
        System.out.println(ex[i]);
      //  Console.WriteLine imprimir na tela usando linguagem c#
        }
        
            }
          
          catch(ArrayIndexOutOfBoundsException e){
        JOptionPane.showMessageDialog(null,"erro no tamanho deste array! "+e);     
    }

    }

}
        
        
        
    
    

