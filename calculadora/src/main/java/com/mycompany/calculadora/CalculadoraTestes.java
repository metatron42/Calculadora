/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Alves
 */
public class CalculadoraTestes {
    
    public static void main (String [] args){
        Calculadora calc = new Calculadora();
        
        //soma de dois valores
        int somar = calc.soma(10,10);
        System.out.println(somar);
        
        //soma de dois valores, sendo um zero
        somar = calc.soma(10,0);
        System.out.println(somar);
        
        //soma de dois valores, ambos zeros
        somar = calc.soma(0,0);
        System.out.println(somar);
        
        //soma de dois valores, sendo um negativo
        somar = calc.soma(10,-1);
        System.out.println(somar);
        
        
        
        //subtrai de dois valores
        int subtrair = calc.subt(10,10);
        System.out.println(subtrair);
        
        //subtrai de dois valores, sendo um zero
        subtrair = calc.subt(10,0);
        System.out.println(subtrair);
        
        //subtrai de dois valores, ambos zeros
        subtrair = calc.subt(0,0);
        System.out.println(subtrair);
        
        //subtrai de dois valores, sendo um negativo
        subtrair = calc.subt(10,-1);
        System.out.println(subtrair);
        
        
        
        //dividi de dois valores
        int dividir = calc.divi(10,10);
        System.out.println(dividir);
        
        //dividi de dois valores, sendo um zero
        dividir = calc.divi(10,0);
        System.out.println(dividir);
        
        //dividi de dois valores, ambos zeros
        dividir = calc.divi(0,0);
        System.out.println(dividir);
        
        //dividi de dois valores, sendo um negativo
        dividir = calc.divi(10,-1);
        System.out.println(dividir);
        
        
        
        //multiplica de dois valores
        int multiplicar = calc.mult(10,10);
        System.out.println(multiplicar);
        
        //multiplica de dois valores, sendo um zero
        multiplicar = calc.mult(10,0);
        System.out.println(multiplicar);
        
        //multiplica de dois valores, ambos zeros
        multiplicar = calc.mult(0,0);
        System.out.println(multiplicar);
        
        //multiplica de dois valores, sendo um negativo
        multiplicar = calc.mult(10,-1);
        System.out.println(multiplicar);
    }
}
