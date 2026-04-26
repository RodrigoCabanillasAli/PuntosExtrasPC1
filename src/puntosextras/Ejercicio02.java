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
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        
        double promedio,pensionbase,pagocontado;
        
        System.out.print("Por favor, ingrese su promedio: ");
        promedio= lector.nextDouble();
        System.out.print("Ingrese ahora su pension: ");
        pensionbase=lector.nextDouble();
        System.out.println("Desea pagar al contado: ");
        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.println("Elija su opcion (1=SI/2=No)");
        int opcion= lector.nextInt();
        
        double porcentaje,descuento;
        
        if(promedio>=18 && promedio<=20){
            porcentaje=0.2;
            descuento=pensionbase*porcentaje;
        }
        else if(promedio>=15 && promedio<=17.99){
            porcentaje=0.1;
            descuento=pensionbase*porcentaje;
        }
        else if(promedio>=13 && promedio<=14.99){
            porcentaje=0.05;
            descuento=pensionbase*porcentaje;
        }
        else
            porcentaje=0;
        descuento=pensionbase*porcentaje;
        
        int bono=(opcion==1)? 50:0;
        
        double montofinal=pensionbase-descuento-bono;
        
        
        System.out.println("====DESGLOSE DE MATRICULA====");
        System.out.printf("Su pension base es: S/%.2f\n",pensionbase);
        System.out.printf("Descuento por promedio: S/%.2f\n",descuento);
        System.out.printf("Bono pago al contado: S/%.2f\n",bono);
        System.out.printf("Monto final a pagar: S/%.2f\n",montofinal);
    }
}
