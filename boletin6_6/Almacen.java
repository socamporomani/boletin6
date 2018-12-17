/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;
import javax.swing.JOptionPane;
/**
 *
 * @author r618b
 */
public class Almacen {

    public void cantidad() {
      int ventasArticulo;
      String tipo="x";
      ventasArticulo=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de ventas"));
      if(ventasArticulo<=100)
         tipo="baixo";
      else if (ventasArticulo>100 && ventasArticulo<=500)
          tipo="medio";
      else if (ventasArticulo>500 && ventasArticulo<=1000)
          tipo="alto";
      else if (ventasArticulo>1000)
          tipo="primera necesidad";
   else
       cantidad();
      
      
      JOptionPane.showMessageDialog(null,"El tipo de articulo es de " + tipo);
    }
    
    
    
}
