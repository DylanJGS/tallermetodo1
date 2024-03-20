/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class TallerMetodos {
    public static double Calcular(double precio, double descuento){
    double nuevoPrecio = precio -(precio*descuento/100);
    return nuevoPrecio;
    }
    
    public static void main(String[]args){
    Scanner teclado=new Scanner(System.in);
    
    // primer caso
    
        System.out.println("Ingrese el precio del primer producto:");
        double precio1=teclado.nextDouble();
        System.out.println("Ingrese el descuento:");
        double descuento1=teclado.nextDouble();
        double total=Calcular(precio1,descuento1);
        System.out.println("EL precio con descuento del primer prudocto es:"+total);
        
        System.out.println("");
        //segundo caso
        
        System.out.println("Ingrese el precio del segundo producto:");
        double precio2=teclado.nextDouble();
        System.out.println("Ingrese el descuento:");
        double descuento2=teclado.nextDouble();
        double total1=Calcular(precio2,descuento2);
        System.out.println("EL precio con descuento del segundo producto es:"+total1);
    
    }
}
