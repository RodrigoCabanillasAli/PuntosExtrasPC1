/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntosextras;

import java.util.Scanner;

/**
 *
 * @author METRO COMAS
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad en Soles(PEN): S/");
        double soles=lector.nextDouble();
        System.out.println("Elija la opcion que desea: ");
        System.out.println("1. Dolares (USD)");
        System.out.println("2. Euros (EUR)");
        System.out.println("3. Libras(GBP)");
        System.out.println("4.Pesos (MXN)");
        System.out.print("Elija una opcion de las 4: ");
        int opcion=lector.nextInt();
        double resultado;
        String moneda="";
        
        switch(opcion){
        case 1:
        resultado=soles*0.27;
        moneda="USD";
            System.out.printf("Resultado: %.2f Soles equivale a %.2f %s\n",soles,resultado,moneda);
            break;
            
        case 2:
            resultado=soles*0.25;
            moneda="EUR";
             System.out.printf("Resultado: %.2f Soles equivale a %.2f %s\n",soles,resultado,moneda);
             break;
             
        case 3:
            resultado=soles*0.21;
            moneda="GBP";
            System.out.printf("Resultado: %.2f Soles equivale a %.2f %s\n",soles,resultado,moneda);
            break;
        
        case 4:
            resultado=soles*4.50;
            moneda="MXN";
            System.out.printf("Resultado: %.2f Soles equivale a %.2f %s\n",soles,resultado,moneda);
            break;
            
        default:
            System.out.println("Moneda no disponible");
            break;
    };
    
    }
            
}
  