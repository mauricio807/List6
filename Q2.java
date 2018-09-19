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
public class Q2  extends Exce{
public static void main(String[] args) throws Exce {
     int num=0;
    int trt=0;
    float media=0;
    int cont=0;
    do{
       try{
        trt=(Integer.parseInt(JOptionPane.showInputDialog("Informe um número, ate que a soma chegue a 100! A soma chegou a 100: "+num+" Já foi somado "+cont+" numeros"+"A media é:"+media)));
        cont++;
        num=num+trt;
        media=(float)num/cont;
        
        
        if(num>=100){
            JOptionPane.showMessageDialog(null,"A soma já foi alcançada : "+num+" foi somados "+cont+" números"+" A média é:"+media);
            throw new Exce();
        }
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Informe um número válido!");  
       }
       }while(num<=100);
    }
}

    

