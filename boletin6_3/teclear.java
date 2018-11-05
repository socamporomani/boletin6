/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;
import javax.swing.JOptionPane;

/**
 *
 * @author socamporomani
 */
public class teclear {
    
    
    public void numero0(){
        double num;
        num=Integer.parseDouble(JOptionPane.showInputDialog("escribe un numéro"));
        if(num>0){
            System.out.println("+");
        }
        else if (num<0){
            System.out.println("-");
        }
        else{
            System.out.println("0");
        }
            
    }
}
