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
public class metodos3 {
    public static double Cambio(double dolares){
    double euros= dolares/1.09;
    return euros;
    
    }
    public static void main(String[]args){
    Scanner teclado= new Scanner(System.in);
    
    //primer caso
    System.out.println("Ingrese el primer valor que quiere cambiar:");
    double dolares1=teclado.nextDouble();
    double euros1=Cambio(dolares1);
    
    System.out.println("Cambio de dolares:  "+dolares1+"  a euros  "+euros1);
    
    System.out.println("");
    
    //segundo caso
    System.out.println("Ingrese el segundo valor que quiere cambiar:");
    double dolares2=teclado.nextDouble();
    double euros2=Cambio(dolares2);
    
    System.out.println("Cambio de dolares:  "+dolares2+"  a euros  "+euros2);
    
    
    }
    
}
