/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;
import javax.swing.JOptionPane;

/**
 *
 * @author socamporomani
 */
public class peso {
    private String nome;
    private float peso;

    
    public peso (String nome, float peso){
    this.nome=nome;
    this.peso=peso;
        }
    
        
    public void Diferenza(peso a, peso b){
        float dif;
        if (a.peso < b.peso){
            dif=b.peso-a.peso;
           JOptionPane.showMessageDialog(null, a.nome +" con "+a.peso+ "kg tiene una diferencia de "+ dif+ "kg con "+ b.nome+ " con " + b.peso+"kg");
        }
        else{
            dif=a.peso-b.peso;
            JOptionPane.showMessageDialog(null, b.nome+" con " + b.peso+"kg tiene una diferencia de "+dif+ "kg con "+ a.nome +" de peso"+a.peso+"kg");
            
        }
    }
}
