/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_5;

/**
 *
 * @author socamporomani
 */
public class Calculo {
    private byte num1;
    private byte num2;
    private byte num3;
     
    public Calculo (int num1, int num2, int num3){
        this.num1=(byte)num1;
        this.num2=(byte)num2;
        this.num3=(byte)num3;
        }
    public void Maior(){
        if (num1>num2 && num1>num3){
                System.out.println(num1 +" es maior");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2 +" es maior");
        }
        else{
            System.out.println(num3 +" é maior");
        }
    }
}
