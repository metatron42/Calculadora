/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alves
 */
public class CalculadoraJunityTeste {
    
    public CalculadoraJunityTeste() {
    }

    
    //soma de dois valores
    @Test
    public void testSomarDoisValoresPositivos() {
        Calculadora calc = new Calculadora();      
        int SomarDoisValores = calc.soma(10,10);
        
        assertEquals(20, SomarDoisValores);
    }
    
    //soma de dois valores, sendo um zero
    @Test
    public void testSomarDoisValoresSendoUmZero(){    
        Calculadora calc = new Calculadora();
        int SomarDoisValores = calc.soma(10,0);
        
        assertEquals(10, SomarDoisValores);
    }
    
    //soma de dois valores, sendo ambos zero
    @Test
    public void testSomarDoisValoresAmbosZero(){
        Calculadora calc = new Calculadora();
        int SomarDoisValores = calc.soma(0,0);
        
        assertEquals(0, SomarDoisValores);
        
    }

    //soma de dois valores, sendo um negativo
    @Test
    public void testSomarDoisValoresSendoUmNegativo(){
        Calculadora calc = new Calculadora();
        int SomarDoisValores = calc.soma(10,-1);
        
        assertEquals(9, SomarDoisValores);
        
    }

    
    
    //subtrai de dois valores
    @Test
    public void testSubtrairDoisValoresPositivos() {
        Calculadora calc = new Calculadora();      
        int SubtrairDoisValores = calc.subt(10,10);
        
        assertEquals(0, SubtrairDoisValores);
    }
    
    //subtrai de dois valores,sendo um zero
    @Test
    public void testSubtrairDoisValoresSendoUmZero(){    
        Calculadora calc = new Calculadora();
        int SubtrairDoisValores = calc.subt(10,0);
        
        assertEquals(10, SubtrairDoisValores);
    }
    
    //subtrai de dois valores,sendo ambos zero
    @Test
    public void testSubtrairDoisValoresAmbosZero(){
        Calculadora calc = new Calculadora();
        int SubtrairDoisValores = calc.subt(0,0);
        
        assertEquals(0, SubtrairDoisValores);
        
    }

    //subtrai de dois valores,sendo um negativo
    @Test
    public void testSubtrairDoisValoresSendoUmNegativo(){
        Calculadora calc = new Calculadora();
        int SubtrairDoisValores = calc.subt(10,-1);
        
        assertEquals(11, SubtrairDoisValores);
        
    }
    
    
    
    //dividi de dois valores
    @Test
    public void testDividirDoisValoresPositivos() {
        Calculadora calc = new Calculadora();      
        int DividirDoisValores = calc.divi(10,10);
        
        assertEquals(1, DividirDoisValores);
    }
    
    //dividi de dois valores,sendo um zero
    @Test
    public void testDividirDoisValoresSendoUmZero(){    
        Calculadora calc = new Calculadora();
        int DividirDoisValores = calc.divi(10,0);
        
        assertEquals(0, DividirDoisValores);
    }
       
    //dividi de dois valores,sendo ambos zero
    @Test
    public void testDividirDoisValoresAmbosZero(){
        Calculadora calc = new Calculadora();
        int DividirDoisValores = calc.divi(0,0);
        
        assertEquals(0, DividirDoisValores);
        
    }

    //subtrai de dois valores,sendo um negativo
    @Test
    public void testDividirDoisValoresSendoUmNegativo(){
        Calculadora calc = new Calculadora();
        int DividirDoisValores = calc.divi(10,-1);
        
        assertEquals(-10, DividirDoisValores);
        
    }
    
    
    //multiplica de dois valores
    @Test
    public void testMultiplicarDoisValoresPositivos() {
        Calculadora calc = new Calculadora();      
        int MultiplicarDoisValores = calc.mult(10,10);
        
        assertEquals(100, MultiplicarDoisValores);
    }
    
    //multiplica de dois valores,sendo um zero
    @Test
    public void testMultiplicarDoisValoresSendoUmZero(){    
        Calculadora calc = new Calculadora();
        int MultiplicarDoisValores = calc.mult(10,0);
        
        assertEquals(0, MultiplicarDoisValores);
    }
       
    //multiplica de dois valores,sendo ambos zero
    @Test
    public void testMultiplicarDoisValoresAmbosZero(){
        Calculadora calc = new Calculadora();
        int MultiplicarDoisValores = calc.mult(0,0);
        
        assertEquals(0, MultiplicarDoisValores);
        
    }

    //multiplica de dois valores,sendo um negativo
    @Test
    public void testMultiplicarDoisValoresSendoUmNegativo(){
        Calculadora calc = new Calculadora();
        int MultiplicarDoisValores = calc.mult(10,-1);
        
        assertEquals(-10, MultiplicarDoisValores);
        
    }
    
}
