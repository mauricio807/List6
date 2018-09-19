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
public class Q3 {
    
     public static void main(String[] args){
        int vet[] = new int [10];
        for(int cont=0;cont<=vet.length;){
            try{
                cont = Integer.parseInt(JOptionPane.showInputDialog("Qual posição deseja inserir"));
            
            }catch(ArrayIndexOutOfBoundsException t){
                JOptionPane.showMessageDialog(null," Posicionamento inválido");
            }    
            try{    
                vet[cont]=Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro"));
            }catch(NumberFormatException t){
                JOptionPane.showMessageDialog(null,"Informe um numero inteiro");     
            }
            
            }

     }
}
