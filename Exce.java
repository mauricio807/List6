/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list6;

/**
 *
 * @author stranger
 */
public class Exce extends Exception{
      private String txt;
    public Exce(){
    }
    public Exce(String t){
        this.txt=t;
    }
    @Override
    public String toString(){
        return "Soma acima de 100, Informe um numero menor!";
    }
}
    
    
 
