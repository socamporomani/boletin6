/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_7;

import java.util.Scanner;

/**
 *
 * @author socamporomani
 */
public class Clase {
    
    public void Elegir(){
        
        System.out.println("\n"
                + " 1 > Cuadrado \n"
                + "2 > Triángulo \n"
                + "3 > circulo");
       
         Scanner ler = new Scanner(System.in);
int opcion =ler.nextInt();
switch(opcion){
    case 1: System.out.println("Has elegido Cuadrado");
            System.out.println("Introduce el lado");
        double areaCuadrado=0;
             Scanner lerLado = new Scanner(System.in);
        double lado =lerLado.nextDouble();
             areaCuadrado= Math.pow(lado, 2);
             System.out.println(areaCuadrado);
    case 2: System.out.println("Has elegido triangulo");
            System.out.println("Introduce base");
        double areaTriangulo=0;
            Scanner lerBase= new Scanner(System.in);
        double base =lerBase.nextDouble();
            System.out.println("introduce altura");
            Scanner lerAltura =new Scanner(System.in);
        double alura =lerAltura.nextDouble();
            areaTriangulo=(base*alura)/2;
            System.out.println(areaTriangulo);
    case 3: System.out.println("Has elegido circulo");
            System.out.println("introduce el radio");
            double areaCirculo=0;
            Scanner lerRadio=new Scanner(System.in);
            double radio=lerRadio.nextDouble();
            areaCirculo=radio*Math.PI;
            System.out.println(areaCirculo);
}
        
    }
}
