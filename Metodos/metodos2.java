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
public class metodos2 {
    
    public static double Perimetro(double lado1, double lado2){
    return 2*(lado1+lado2);
    
    }
    public static double Area(double lado1, double lado2){
    return lado1+lado2;
    }
    
    public static void main(String[]args){
    Scanner teclado=new Scanner(System.in);
    
    // primer caso
    System.out.println("Ingrese el primer lado del rectangulo:");
    double lado=teclado.nextDouble();
    System.out.println("Ingrese el segundo lado del rectangulo:");
    double lados=teclado.nextDouble();
    System.out.println("Ingrese el tipo de calculo(1 perimetro, 2 Area):");
    int tipo=teclado.nextInt();
    if (tipo==1){
    System.out.println("Calcular el perimetro:"+Perimetro(lado,lados));
    
    }else if (tipo==2){
    System.out.println("Calcular el Area:"+Area(lado,lados));
    
    }else{
    System.out.println("Tipo de calculo no valido");
    }
    
    System.out.println("");
    
    //segundo caso
    System.out.println("Ingrese el primer lado del rectangulo:");
    double lado1=teclado.nextDouble();
    System.out.println("Ingrese el segundo lado del rectangulo:");
    double lados1=teclado.nextDouble();
    System.out.println("Ingrese el tipo de calculo(1 perimetro, 2 Area):");
    int tipo1=teclado.nextInt();
    if (tipo1==1){
    System.out.println("Calcular el perimetro:"+Perimetro(lado1,lados1));
    
    }else if (tipo1==2){
    System.out.println("Calcular el Area:"+Area(lado1,lados1));
    
    }else{
    System.out.println("Tipo de calculo no valido");
    }
    
    
    }
}
