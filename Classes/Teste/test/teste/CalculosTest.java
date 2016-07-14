/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author PC
 */
public class CalculosTest {
    
    @Test
    public void testeSomaNegativa(){
        Calculos c = new Calculos();
        int a = -2;
        int b = 2;
        int resultEspe = 4;
        int resul = c.somar(a, b);
        
        assertEquals(resultEspe, resul);
    }
    
    @Test
    public void testeDivisaoPorZero(){
        Calculos c = new Calculos();
        int a = 2;
        int b = 0;
        int resultEspe = -1;
        int resul = c.dividir(a, b);
        
        assertEquals(resultEspe, resul);
    }
    
    @Test
    public void testeMultiplicacaoPorNegativo(){
        Calculos c = new Calculos();
        int a = 2;
        int b = -2;
        int resultEspe = -1;
        int resul = c.multiplicar(a, b);
        
        assertEquals(resultEspe, resul);
    }
    
    @Test
    public void testeSubtracaoNegativa(){
        Calculos c = new Calculos();
        int a = 2;
        int b = -2;
        int resultEspe = 0;
        int resul = c.subtrair(a, b);
        
        assertEquals(resultEspe, resul);
    }
    
}
