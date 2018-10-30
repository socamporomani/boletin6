/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2;
import javax.swing.JOptionPane;
/**
 *compara si el 1º numero es menor que el segundo y calcula
 * @author socamporomani
 */
public class numeros {
    /**
     * Introducese los numeros por teclado
     * 
     */
    public void num(){
        short num1,num2,resta,suma = 0;
        num1=Short.parseShort(JOptionPane.showInputDialog("escribe el numero 1"));
        num2=Short.parseShort(JOptionPane.showInputDialog("escribe el 2º numero"));
        if(num1>=num2){
        resta=(short) (num1-num2);
            System.out.println(resta);
        }
        else{
            suma=(short) (num1+num2);
        System.out.println(suma);
    }
    }
}
