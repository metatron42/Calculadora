package com.mycompany.calculadora;

/**
 *
 * @author Alves
 */
public class Calculadora {

    /**
     * classe para somar dois valores
     */
    public int soma(int a, int b) {
        return a + b;
    }
    
    /**
     * classe para subtrair dois valores
     */
    public int subt(int a, int b) {
        return a - b;
    }
    
    /**
     * classe para dividir dois valores  
     */
    public int divi(int a, int b) {
       if (b == 0) {
           throw new ArithmeticException("Não é possível dividir por zero");
       } else {           
           return a / b;
       }
    }
    
    
    /**
     * classe para multiplicar dois valores   
     */
    public int mult(int a, int b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        
    }
}