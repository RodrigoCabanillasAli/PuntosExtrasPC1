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
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        int horas,minutos,segundos;
        
        System.out.print("Ingrese su o sus horas(0-23): ");
        horas= lector.nextInt();
        System.out.print("Ingrese su o sus minutos(0-59): ");
        minutos= lector.nextInt();
        System.out.print("Ingrese sus segundos(0-59): ");
        segundos= lector.nextInt();
        
        if(horas<0 | horas>23 | minutos<0 | minutos>59 | segundos<0 | segundos>59){
            System.out.println("Se ha producido un error, por favor ingrese de nuevo los datos pedidos.");
        }
        
        segundos++;
        if(segundos>=60){
            segundos=0;
            minutos++;
        } if(minutos>=60){
            minutos=0;
            horas++;
        } if(horas>=24){
            horas=0;
        }
        System.out.printf("La hora calculada seria: %02d:%02d:%02d\n",horas,minutos,segundos);
    }
    }
